package com.sangto.retail.scheduled;

import com.sangto.retail.scheduled.utils.DataTransferUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataTransferSqlServiceImpl implements DataTransferSqlService {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate; // crm链接数据源

    @Override
    public List<Map<String, Object>> getUnDoTaskSql() {
        String sql = "SELECT * FROM task_base WHERE stat_ = '4' ORDER BY task_id_ ASC LIMIT 0,500 ";
        List<Map<String, Object>> queryList=jdbcTemplate.queryForList(sql);
        logger.info("==1=="+queryList);
        return queryList;
    }

    @Override
    public List<Map<String, Object>> getAddDataSql(Map<String, Object> map) {
        String sql = "SELECT * from " + map.get("oprt_object_") + " where " + map.get("oprt_condition_value_");
        List<Map<String, Object>> queryList=jdbcTemplate.queryForList(sql);
        logger.info("==2=="+queryList);
        return queryList;
    }

    @Override
    public String getDelTableSql(String tableName,String tableCondition) {
        String sql = "delete from " + tableName + " where " +tableCondition;
        jdbcTemplate.update(sql);
        return sql;
    }

    @Override
    public String getUpdateTaskStatSql(long taskId, String stat, String statInfo) {
        String sql = "Update task_base set stat_ = '" + stat + "', stat_info_ = '" + statInfo + "' , task_finish_date_ =now()   where task_id_ ="
                + taskId;
        jdbcTemplate.update(sql);
        return sql;
    }

    @Override
    public String getAddTableSql(String tableName,Map<String, Object> map) {
        String sql = "INSERT INTO " + tableName + "  "  + DataTransferUtils.insertToCenterSqlstr(map);
        jdbcTemplate.update(sql);
        return sql;
    }
}
