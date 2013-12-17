package com.study.test.services.test3Service.impl;

import com.study.test.services.test3Service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceByJava implements IUserService {
    @Override
    public String execute(String str) {
        return "UserServiceByJava say :"+str;
    }
}
