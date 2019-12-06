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
     * http://localhost:8081/api/user/getAllUser
     *
     * @return
     */
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    /**
     *  查询所有用户，同时联合查询到关联的role角色
     *  浏览器测试：http://localhost:8081/api/user/getAllUser1
     * @return
     */
    @RequestMapping("/getAllUser1")
    public List<User> getAllUser1(){
        return userService.getAllUser1();
    }

    /**
     * 用户登录方法
     * 浏览器测试：http://localhost:8081/api/user/login?username=15066668888&password=123456
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public User login(String username, String password) {
        return userService.login(username, password);
    }

    /**
     * 注册用户方法
     * 浏览器测试：http://localhost:8081/api/user/adduser?username=13100001112&password=654321&roleid=1
     * 问题：userinfoid在用户注册的时候自动增长？然后取消userinfo主键id自动增长（实践证明表不能有2列自动增长列），然后用户填写userinfo基本信息时按userinfoid insert
     * 后面怎样与userinfo主键表映射呢？* 添加外键约束？在用户表把userinfoid也设置为自增长？
     * 在用户填写userinfo表后根据其主键id再次回来更新设置userinfoid？--已写此方法adduserinfoid
     *
     * @param user
     * @return
     */
    @RequestMapping("/adduser")
    public Integer addUser(User user){
        return userService.insert(user);
    }

    /**
     * 根据Userinfo表的id，返回更新User表的userinfoid
     * 测试方法：http://localhost:8081/api/user/adduserinfoid?id=6&userinfoid=6
     * @param id
     * @param userinfoid
     * @return
     */
    @RequestMapping("/adduserinfoid")
    public Integer adduserinfoid(int id, int userinfoid){
        return userService.adduserinfoid(id, userinfoid);
    }

}
