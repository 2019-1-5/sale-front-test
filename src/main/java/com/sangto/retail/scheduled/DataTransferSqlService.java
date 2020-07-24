package com.sangto.retail.scheduled;

import java.util.List;
import java.util.Map;

public interface DataTransferSqlService {

    // 获取待处理的sql
    public List<Map<String, Object>> getUnDoTaskSql();

    // 获取数据的sql
    public List<Map<String, Object>> getAddDataSql(Map<String, Object> map) ;

    // 删除任务状态sql
    public String getDelTableSql(String tableName,String tableCondition);

    // 更新任务状态sql
    public String getUpdateTaskStatSql(long taskId, String stat, String statInfo);


    // 增加任务状态sql
    public String getAddTableSql(String tableName,Map<String, Object> map);

}
