package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.User;

import java.util.List;

public interface UserService {
    //查询
    List<User> getAllUser(); //不用分页查询

    List<User> getAllUser1(); //不用分页查询
}
