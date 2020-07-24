package com.sangto.retail.scheduled;

import com.alibaba.fastjson.JSONObject;
import com.sangto.retail.scheduled.Domain.SqlDomain;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.mateng.framework.common.exception.BusinessException;

import java.util.List;
import java.util.Map;

@Service
public class DataUploadServiceImpl implements  DataUploadService{

    private Logger logger = Logger.getLogger(this.getClass());


    @Autowired
    private DataTransferSqlService dataTransferSqlService;

    @Override
    @Transactional
    public void upload() {
        // 查询自动任务的表
        List<Map<String, Object>> getTaskBaseSql = dataTransferSqlService.getUnDoTaskSql();
        if(getTaskBaseSql != null && getTaskBaseSql.size() > 0){
            for(Map<String, Object> map: getTaskBaseSql){
                String stat = "";
                String message = "";

                boolean flag = true;//开关，可以传输至后台
                long taskno = (long) map.get("task_id_");

                try {
                    SqlDomain sqlDomain = new SqlDomain();
                    sqlDomain.setOprtType(String.valueOf(map.get("oprt_type_")));//增加ADD,删除DEL
                    sqlDomain.setTableName(String.valueOf(map.get("oprt_object_")));//表名
                    sqlDomain.setTableCondition(String.valueOf(map.get("oprt_condition_value_")));//条件
                    if ("ADD".equals(map.get("oprt_type_"))) {
                        // 根据自动任务表查询所处理的对应表的数据
                        List<Map<String, Object>> addDataSql = dataTransferSqlService.getAddDataSql(map);
                        if(addDataSql != null && addDataSql.size() > 0){
                            sqlDomain.setTableVaule(addDataSql);//查询出来的表数据
                            logger.info("对应要增加表的数据" + addDataSql);
                        }else{
                            logger.info("没有数据需要新增");
                            flag = false;
                        }
                    }
                    if(flag){
    //                 数据传输
                        JSONObject.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
                        //将查到的数据插入到crm库对应表中
                        String s = upload2(sqlDomain);

                        if(s.equals("同步成功")){
                            logger.info("==同步成功==");
                            stat = "5";
                            message = "同步成功";
                        }else{
                            stat = "3";
                            message = "处理失败";
                        }
                    }else {
                        stat = "3";
                        message = "处理失败,没有数据";
                    }
                    //==============================
                    // 修改任务状态
                    dataTransferSqlService.getUpdateTaskStatSql(taskno, stat, message);
                } catch (Exception e) {
                    String msg = "处理失败" + e.getMessage();
                    if (msg.length() > 255) {
                        msg = msg.substring(0, 255);
                    }
                    // 修改任务状态
                    dataTransferSqlService.getUpdateTaskStatSql(taskno, "3", msg);
                }
            }
        }
    }


    public String upload2(SqlDomain sqlDomain) {
        try {
            if(StringUtils.isBlank(sqlDomain.getOprtType())) {
                throw new BusinessException(-1, "操作类型不能为空");
            }
            if(StringUtils.isBlank(sqlDomain.getTableName())) {
                throw new BusinessException(-1, "操作的表名 不能为空");
            }
            if(StringUtils.isBlank(sqlDomain.getTableCondition())) {
                throw new BusinessException(-1, "操作条件值不能为空");
            }
            if ("ADD".equals(sqlDomain.getOprtType() + "")) {
                logger.info("需要处理的数据" + sqlDomain.getTableName()  + ":"+ sqlDomain.getTableVaule() );
                // 删除
                String deleteSql = dataTransferSqlService.getDelTableSql(sqlDomain.getTableName(), sqlDomain.getTableCondition());

                List<Map<String,Object>> tableValueList=sqlDomain.getTableVaule();
                if(tableValueList!=null && tableValueList.size()>0) {
                    for (Map<String, Object> tableVale : tableValueList) {
                        logger.info("新增" + sqlDomain.getTableName()  + ":"+ sqlDomain.getTableVaule() );

                        String addSql = dataTransferSqlService.getAddTableSql(sqlDomain.getTableName() + "", tableVale);
                    }
                }else {
                    logger.info("未找到处理的数据 delete ：" + deleteSql);
                }
            } else {
                // 删除
                dataTransferSqlService.getDelTableSql(sqlDomain.getTableName(),sqlDomain.getTableCondition());
            }
            return "同步成功";
        } catch (Exception e) {
            logger.info("error" + e);
            return "同步失败";
        }
    }
}
