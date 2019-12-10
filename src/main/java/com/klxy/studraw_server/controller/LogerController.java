package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Label;
import com.klxy.studraw_server.model.Loger;
import com.klxy.studraw_server.service.LabelService;
import com.klxy.studraw_server.service.LogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loger")
public class LogerController {
    @Autowired
    LogerService logerService;

    /**
     *  查询所有loger
     *  浏览器测试：http://localhost:8081//api/loger/getAllLoger
     * @return
     */
    @RequestMapping("/getAllLoger")
    public List<Loger> getAllLoger(){
        return logerService.getAllLoger();
    }

    /**
     *  新增loger
     *  浏览器测试：http://localhost:8081//api/loger/addLoger?userid=2&logip=192.168.1.129
     * @param loger
     * @return
     */
    @RequestMapping("/addLoger")
    public Integer addLoger(Loger loger){
        return logerService.addLoger(loger);
    }

    /**
     *  按id删除loger
     *  浏览器测试：http://localhost:8081//api/loger/delLogerByid?id=2
     * @param id
     * @return
     */
    @RequestMapping("/delLogerByid")
    public Integer delLogerByid(int id){
        return logerService.delLogerByid(id);
    }

    /**
     * 按userid删除loger
     *  浏览器测试：http://localhost:8081//api/loger/delLogerByuserid?userid=2
     * @param userid
     * @return
     */
    @RequestMapping("/delLogerByuserid")
    public Integer delLogerByuserid(int userid) {
        return logerService.delLogerByuserid(userid);
    }
}
