package com.study.test.module.test5Module

import javax.persistence.*

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-12-9
 * Time: 下午1:18
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "groovytesttable")
public class GroovyTestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id
    public String firstname
    public String lastname
    public Integer location_id
    public String location_name

    public Integer getId(){
        return this.id
    }
    public String getFirstname(){
        this.firstname
    }
    public String getLastname(){
        this.lastname
    }
    public Integer getLocation_id(){
        this.location_id
    }
    public String getLocation_name(){
        this.location_name
    }

}
