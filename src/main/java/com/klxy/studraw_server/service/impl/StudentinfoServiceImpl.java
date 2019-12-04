package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.StudentinfoDao;
import com.klxy.studraw_server.model.Studentinfo;
import com.klxy.studraw_server.service.StudentinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentinfoServiceImpl implements StudentinfoService {
    @Resource
    StudentinfoDao studentinfoDao;

    @Override
    public List<Studentinfo> getAllStudentinfo() {
        return studentinfoDao.getAllStudentinfo();
    }
}
