package com.study.test.controller.test5Controller

import com.study.test.module.test5Module.GroovyTestTable
import com.study.test.services.test5Service.IDBTestService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

import javax.annotation.Resource

/**
 * Created with IntelliJ IDEA.
 * User: Ajian
 * Date: 13-11-29
 * Time: 下午5:31
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("dbtest")
class DBTestController {
    @Resource(name = "DBTestService")
    private IDBTestService dbTestService;

    /**
     * 获取所有数据
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getTestData(){
        ModelAndView mav = new ModelAndView("dbtest");
        mav.addObject("dataList",dbTestService.getAllData());
        mav;
    }

    /**
     * 随机保存数据
     */
    @RequestMapping(value = 'randomSave',method = RequestMethod.GET)
    public ModelAndView randomSaveAndShow(){
        dbTestService.save(new GroovyTestTable(firstname: 'random'+new Random(200).nextInt(),
                lastname: 'randomLN'+new Random(500).nextInt(),location_id: 1,
                location_name: '重庆渝中区和平路'+new Random(1000).nextInt()+'号'))
        getTestData()
    }

    /**
     * 根据编号删除数据
     * @param id
     * @return
     */
    @RequestMapping(value = 'delete/{id}',method = RequestMethod.GET)
    public ModelAndView deleteAndShow(@PathVariable Integer id){
        dbTestService.deleteById(id)
        getTestData()
    }
}
