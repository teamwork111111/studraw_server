package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.User;

import java.util.List;

public interface UserService {
    //查询
    List<User> getAllUser();//xml方式

    List<User> getAllUser1(); //注解方式

    User getUserByid(int id);//按id查询用户

    User login(String username, String password);//用户登录

    Integer insert(User user);//用户注册

    Integer adduserinfoid(int id, int userinfoid);//完善User表userinfoid

    Integer uptUserByCondition(User user);

    Integer delUser(int id);
}
