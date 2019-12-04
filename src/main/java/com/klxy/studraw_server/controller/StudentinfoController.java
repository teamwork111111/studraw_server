package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Studentinfo;
import com.klxy.studraw_server.service.StudentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/studentinfo")
public class StudentinfoController {
    @Autowired
    StudentinfoService studentinfoService;

    /**
     * 查询所有学生信息,联合查询Schoolmajor信息
     * 浏览器测试：http://localhost:8081/api/studentinfo/getAllStudentinfo
     * @return
     */
    @RequestMapping("/getAllStudentinfo")
    public List<Studentinfo> getAllStudentinfo(){
        return studentinfoService.getAllStudentinfo();
    }
}
