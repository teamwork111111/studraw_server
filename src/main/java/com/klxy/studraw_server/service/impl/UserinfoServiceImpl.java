package com.klxy.studraw_server.service.impl;


import com.klxy.studraw_server.dao.UserinfoDao;
import com.klxy.studraw_server.model.Userinfo;
import com.klxy.studraw_server.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    UserinfoDao userinfoDao;


    @Override
    public List<Userinfo> getAllUserinfo() {
        return userinfoDao.getAllUserinfo();
    }

    @Override
    public Userinfo getUserinfoByUserinfoid(int userinfoid) {
        return userinfoDao.getUserinfoByUserinfoid(userinfoid);
    }

    @Override
    public Integer addUserinfo(Userinfo userinfo) {
        return userinfoDao.addUserinfo(userinfo);
    }

    @Override
    public Integer uptUserinfo(Userinfo userinfo) {
        return userinfoDao.uptUserinfo(userinfo);
    }

    @Override
    public Integer delUserinfo(int id) {
        return userinfoDao.delUserinfo(id);
    }
}
