package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.User;

import java.util.List;

public interface UserService {
    //查询
    List<User> getAllUser();//xml方式

    List<User> getAllUser1(); //注解方式
}
