package com.study.test.services.test5Service.impl

import com.study.test.dao.dbtestDao.IDBTestDao
import com.study.test.module.test5Module.GroovyTestTable
import com.study.test.services.test5Service.IDBTestService
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午5:34
 * To change this template use File | Settings | File Templates.
 */
@Service
class DBTestService implements IDBTestService {
    @Resource(name = "DBTestDao")
    private IDBTestDao dbTestDao;


    @Override
    List<GroovyTestTable> getAllData() {
        return dbTestDao.queryAllData();
    }

    @Override
    void save(GroovyTestTable bean) {
        dbTestDao.save(bean)
    }

    @Override
    void deleteById(Integer id) {
        def b = dbTestDao.queryById(id)
        if(b==null)return
        dbTestDao.delete(b)
    }
}
