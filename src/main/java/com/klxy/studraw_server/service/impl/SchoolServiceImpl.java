package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.SchoolDao;
import com.klxy.studraw_server.model.School;
import com.klxy.studraw_server.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Resource
    SchoolDao schoolDao;


    @Override
    public School getSchoolBySchid(int schid) {
        return schoolDao.getSchoolBySchid(schid);
    }

    @Override
    public List<School> getAllSchool() {
        return schoolDao.getAllSchool();
    }

    @Override
    public Integer addSchool(School school) {
        return schoolDao.addSchool(school);
    }

    @Override
    public Integer uptSchool(School school) {
        return schoolDao.uptSchool(school);
    }

    @Override
    public Integer delSchool(int id) {
        return schoolDao.delSchool(id);
    }
}
