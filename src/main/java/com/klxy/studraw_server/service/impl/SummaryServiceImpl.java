package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.RoleDao;
import com.klxy.studraw_server.dao.SummaryDao;
import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.model.Summary;
import com.klxy.studraw_server.service.RoleService;
import com.klxy.studraw_server.service.SummaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SummaryServiceImpl implements SummaryService {
    @Resource
    SummaryDao summaryDao;


    @Override
    public List<Summary> getAllSummary() {
        return summaryDao.getAllSummary();
    }

    @Override
    public List<Summary> getSummaryByCondition(Summary summary) {
        return summaryDao.getSummaryByCondition(summary);
    }
    /*@Override
    public List<Summary> getSummaryByCondition(int userid, String content, String createtime1, String createtime2) {
        return summaryDao.getSummaryByCondition(userid,content,createtime1,createtime2);
    }*/

    @Override
    public Summary getSummaryByid(int id) {
        return summaryDao.getSummaryByid(id);
    }





}
