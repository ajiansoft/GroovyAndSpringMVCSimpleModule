package com.study.test.controller.test4Controller

import com.study.test.services.test3Service.IUserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

import javax.annotation.Resource

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午5:13
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("groovyUser")
class UserInfo_GroovyController {
    @Resource(name = "userServiceByGroovy")
    private IUserService userService_groovy;

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public ModelAndView test2(@RequestParam String str){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("str",userService_groovy.execute(str));
        return mav;
    }
}
