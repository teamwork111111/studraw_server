package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.UserDao;
import com.klxy.studraw_server.model.User;
import com.klxy.studraw_server.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public List<User> getAllUser1() {
        return userDao.getAllUser1();
    }
}
