package com.diyFramework.session;

import java.util.List;

public interface SqlSession {

    <E> List<E> selectList(String statementId, Object... param) throws Exception;

    <T> T selectOne(String statementId, Object... param) throws Exception;

    void close() throws Exception;

}
