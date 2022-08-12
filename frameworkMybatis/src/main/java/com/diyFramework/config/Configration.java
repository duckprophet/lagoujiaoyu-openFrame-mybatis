package com.diyFramework.config;

import javax.sql.DataSource;

public class Configration {

    //    数据源
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
