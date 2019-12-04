package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.User;
import com.klxy.studraw_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/user") //每个控制类定义一个统一的链接，避免与其他控制类冲突  访问该类用：http://localhost:8081/api/user/xxx
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 测试查询所有用户
     * @return
     */
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    /**
     *  查询所有用户，同时联合查询到关联的role角色
     *  测试链接：http://localhost:8081/api/user/getAllUser
     * @return
     */
    @RequestMapping("/getAllUser1")
    public List<User> getAllUser1(){
        return userService.getAllUser1();
    }
}
