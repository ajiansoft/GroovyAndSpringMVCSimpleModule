package com.study.test.dao.dbtestDao;

import com.study.test.module.test5Module.GroovyTestTable;
import org.codehaus.groovy.ant.Groovy;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
public interface IDBTestDao {
    public List<GroovyTestTable> queryAllData();
    public void save(GroovyTestTable bean);
    public GroovyTestTable queryById(Integer id);
    public void delete(GroovyTestTable bean);
}
