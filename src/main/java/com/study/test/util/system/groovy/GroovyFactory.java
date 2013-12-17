package com.study.test.util.system.groovy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 用于读取所有Groovy bean，代替applicationContext.xml中的<bean>配置
 * User: Ajian
 * Date: 13-11-28
 * Time: 下午6:07
 * To change this template use File | Settings | File Templates.
 */
public class GroovyFactory implements ApplicationContextAware{
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
