package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.StudentinfoDao;
import com.klxy.studraw_server.dao.TeacherinfoDao;
import com.klxy.studraw_server.model.Teacherinfo;
import com.klxy.studraw_server.service.TeacherinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherinfoServiceImpl implements TeacherinfoService {
    @Resource
    TeacherinfoDao teacherinfoDao;

    @Override
    public List<Teacherinfo> getAllTeacherinfo() {
        return teacherinfoDao.getAllTeacherinfo();
    }
}
