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

    @Override
    public User getUserByid(int id) {
        return userDao.getUserByid(id);
    }

    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }

    @Override
    public Integer insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public Integer adduserinfoid(int id, int userinfoid) {
        return userDao.adduserinfoid(id, userinfoid);
    }

    @Override
    public Integer uptUserByCondition(User user) {
        return userDao.uptUserByCondition(user);
    }

    @Override
    public Integer delUser(int id) {
        return userDao.delUser(id);
    }

}
