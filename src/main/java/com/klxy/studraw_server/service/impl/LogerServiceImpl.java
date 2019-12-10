package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.LogerDao;
import com.klxy.studraw_server.model.Loger;
import com.klxy.studraw_server.service.LogerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LogerServiceImpl implements LogerService {
    @Resource
    LogerDao logerDao;

    @Override
    public List<Loger> getAllLoger() {
        return logerDao.getAllLoger();
    }

    @Override
    public Integer addLoger(Loger loger) {
        return logerDao.addLoger(loger);
    }

    @Override
    public Integer delLogerByid(int id) {
        return logerDao.delLogerByid(id);
    }

    @Override
    public Integer delLogerByuserid(int userid) {
        return logerDao.delLogerByuserid(userid);
    }
}
