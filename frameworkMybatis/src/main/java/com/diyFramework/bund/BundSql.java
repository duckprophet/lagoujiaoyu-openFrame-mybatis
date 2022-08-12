package com.diyFramework.bund;

import com.diyFramework.Mapping.ParameterMapping;

import java.util.ArrayList;
import java.util.List;

public class BundSql {

    /*解析过后的sql*/
    private String sqlText;

    /*解析出来的参数*/
    private List<ParameterMapping> parameterMappingList = new ArrayList<ParameterMapping>();

    public BundSql(String sqlText, List<ParameterMapping> parameterMappingList) {
        this.sqlText = sqlText;
        this.parameterMappingList = parameterMappingList;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public List<ParameterMapping> getParameterMappingList() {
        return parameterMappingList;
    }

    public void setParameterMappingList(List<ParameterMapping> parameterMappingList) {
        this.parameterMappingList = parameterMappingList;
    }
}
