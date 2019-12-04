package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Schoolmajor;
import com.klxy.studraw_server.service.SchoolmajorServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/schoolmajor")
public class SchoolmajorController {
    @Autowired
    SchoolmajorServcie schoolmajorServcie;

    /**
     * 查询所有学校以及专业
     * 浏览器测试：http://localhost:8081/api/schoolmajor/getAllSchoolMajor
     * @return
     */
    @RequestMapping("/getAllSchoolMajor")
    public List<Schoolmajor> getAllSchoolMajor(){
        return schoolmajorServcie.getAllSchoolMajor();
    }
}
