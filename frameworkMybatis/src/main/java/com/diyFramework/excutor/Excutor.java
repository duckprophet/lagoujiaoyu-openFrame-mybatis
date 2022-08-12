package com.diyFramework.excutor;

import com.diyFramework.config.Configration;
import com.diyFramework.statement.MappedStatement;

import java.util.List;

public interface Excutor {

    <E> List<E> query(Configration configration, MappedStatement mappedStatement, Object[] param) throws Exception;


}
