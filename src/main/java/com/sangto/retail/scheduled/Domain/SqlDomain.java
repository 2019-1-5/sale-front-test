package com.sangto.retail.scheduled.Domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public class SqlDomain {
    @ApiModelProperty(value="操作类型,增加ADD,删除DEL")
    private String oprtType;

    @ApiModelProperty(value="需要操作的表名")
    private String tableName;

    @ApiModelProperty(value="需要操作数据")
    private List<Map<String,Object>> tableVaule;

    @ApiModelProperty(value="操作条件值")
    private String tableCondition;

    public String getOprtType() {
        return oprtType;
    }

    public void setOprtType(String oprtType) {
        this.oprtType = oprtType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Map<String, Object>> getTableVaule() {
        return tableVaule;
    }

    public void setTableVaule(List<Map<String, Object>> tableVaule) {
        this.tableVaule = tableVaule;
    }

    public String getTableCondition() {
        return tableCondition;
    }

    public void setTableCondition(String tableCondition) {
        this.tableCondition = tableCondition;
    }
}
