package com.diyFramework.session.impl;

import com.diyFramework.config.Configration;
import com.diyFramework.session.SqlSession;

import java.util.List;

public class DefaultSqlSession implements SqlSession {

    private Configration configration;


    @Override
    public <E> List<E> selectList(String statementId, Object... param) throws Exception {
        return null;
    }

    @Override
    public <T> T selectOne(String statementId, Object... param) throws Exception {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
