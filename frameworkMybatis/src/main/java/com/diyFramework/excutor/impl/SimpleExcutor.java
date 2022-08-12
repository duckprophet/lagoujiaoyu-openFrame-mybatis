package com.diyFramework.excutor.impl;

import com.diyFramework.Mapping.ParameterMapping;
import com.diyFramework.bund.BundSql;
import com.diyFramework.config.Configration;
import com.diyFramework.excutor.Excutor;
import com.diyFramework.statement.MappedStatement;

import javax.naming.Name;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SimpleExcutor implements Excutor {


    private Connection connection = null;

    @Override
    public <E> List<E> query(Configration configration, MappedStatement mappedStatement, Object[] param) throws SQLException {
        /*获取链接*/
        connection = configration.getDataSource().getConnection();

        /*对sql进行处理*/
        String sql = mappedStatement.getSql();
        BundSql bundSql = getBundSql(sql);

        String finalSql = bundSql.getSqlText();

        /*获取传入参数类型*/
        Class<?> parameterType = mappedStatement.getParamterType();

        /*获取预编译preprameterStatement对象*/
        PreparedStatement preparedStatement = connection.prepareStatement(finalSql);

        List<ParameterMapping> parameterMappingList = bundSql.getParameterMappingList();

        for (int i = 0; i < parameterMappingList.size(); i++) {
            ParameterMapping parameterMapping = parameterMappingList.get(i);
            String name = parameterMapping.getnan
            String name = parameterType.getDeclaredFields(Name);
        }

    }
}
