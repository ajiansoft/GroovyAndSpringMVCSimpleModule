package com.study.test.dao.dbtestDao.impl

import com.study.test.dao.dbtestDao.IDBTestDao
import com.study.test.module.test5Module.GroovyTestTable
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午5:39
 * To change this template use File | Settings | File Templates.
 */
@Repository
class DBTestDao implements IDBTestDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    List<GroovyTestTable> queryAllData() {
        List<Object> list = this.sessionFactory.currentSession.createSQLQuery("select * from groovytesttable").list()
        List<GroovyTestTable> tables = new ArrayList<GroovyTestTable>()
        list.each {
            Object[] o = (Object[])it;
            tables.add(new GroovyTestTable(id:o[0],firstname: o[1],lastname: o[2],location_id: o[3],location_name: o[4]))

        }
        tables
    }

    @Override
    void save(GroovyTestTable bean) {
        this.sessionFactory.currentSession.save(bean)
    }

    @Override
    GroovyTestTable queryById(Integer id) {
        List<GroovyTestTable> list = this.sessionFactory.currentSession.createQuery("from GroovyTestTable where id=?").setInteger(0,id).list()
        def d=null
        list.each {
            d=it
        }
        d
    }

    @Override
    void delete(GroovyTestTable bean) {
        this.sessionFactory.currentSession.delete(bean)
    }
}
