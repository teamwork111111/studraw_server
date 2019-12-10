package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Loger;
import com.klxy.studraw_server.model.School;
import com.klxy.studraw_server.service.LogerService;
import com.klxy.studraw_server.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    /**
     *  按schid查询school
     *  浏览器测试：http://localhost:8081//api/school/getSchoolBySchid?schid=1
     * @return
     */
    @RequestMapping("/getSchoolBySchid")
    public School getSchoolBySchid(int schid){
        return schoolService.getSchoolBySchid(schid);
    }

    /**
     * 查询所有学校
     * 浏览器测试：http://localhost:8081//api/school/getAllSchool
     * @return
     */
    @RequestMapping("/getAllSchool")
    public List<School> getAllSchool(){
        return schoolService.getAllSchool();
    }

    /**
     * 新增学校
     * 浏览器测试：http://localhost:8081//api/school/addSchool?schoolname=测试新增&code=测试&desc=测试&logo=测试
     * insert into school values(default,'凯里学院','001','这是学校的介绍','abc1');
     *
     * @param school
     * @return
     */
    @RequestMapping("/addSchool")
    public Integer addSchool(School school){
        return schoolService.addSchool(school);
    }

    /**
     * 更新学校
     * 浏览器测试：http://localhost:8081//api/school/uptSchool?id=13&schoolname=测试更新&code=测试&desc=测试&logo=测试
     * @param school
     * @return
     */
    @RequestMapping("/uptSchool")
    public Integer uptSchool(School school){
        return schoolService.uptSchool(school);
    }

    /**
     * 删除学校
     * 浏览器测试：http://localhost:8081//api/school/delSchool?id=14
     * @param id
     * @return
     */
    @RequestMapping("/delSchool")
    public Integer delSchool(int id){
        return schoolService.delSchool(id);
    }
}
