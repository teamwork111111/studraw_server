package com.klxy.studraw_server.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Object getAllUser(User user, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userDao.getAllUser(user);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;

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
    public User selUserinfoidByusername(String username){
        return userDao.selUserinfoidByusername(username);
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
    public Integer uptPwdByusername(String username,String password) {
        return userDao.uptPwdByusername(username,password);
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
