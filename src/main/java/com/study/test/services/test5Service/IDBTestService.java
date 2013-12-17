package com.study.test.services.test5Service;

import com.study.test.module.test5Module.GroovyTestTable;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午5:35
 * To change this template use File | Settings | File Templates.
 */
public interface IDBTestService {
    public List<GroovyTestTable> getAllData();
    public void save(GroovyTestTable bean);
    public void deleteById(Integer id);
}
