package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Studentinfo;
import com.klxy.studraw_server.model.Teacherinfo;
import com.klxy.studraw_server.service.StudentinfoService;
import com.klxy.studraw_server.service.TeacherinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teacherinfo")
public class TeacherinfoController {
    @Autowired
    TeacherinfoService teacherinfoService;

    /**
     * 查询所有老师信息,联合查询学校信息
     * 测试方法：http://localhost:8081/api/teacherinfo/getAllTeacherinfo
     * @return
     */
    @RequestMapping("/getAllTeacherinfo")
    public List<Teacherinfo> getAllTeacherinfo(){
        return teacherinfoService.getAllTeacherinfo();
    }
}
