package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.SchoolmajorDao;
import com.klxy.studraw_server.model.Schoolmajor;
import com.klxy.studraw_server.service.SchoolmajorServcie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SchoolmajorServiceImpl implements SchoolmajorServcie {
    @Resource
    SchoolmajorDao schoolmajorDao;

    @Override
    public List<Schoolmajor> getAllSchoolMajor() {
        return schoolmajorDao.getAllSchoolMajor();
    }
}
