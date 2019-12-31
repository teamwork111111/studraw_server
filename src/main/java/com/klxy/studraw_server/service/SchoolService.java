package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Loger;
import com.klxy.studraw_server.model.School;

import java.util.List;

public interface SchoolService {
    School getSchoolBySchid(int schid);
    Object getAllSchool(School school, int pageNum, int pageSize);
    Integer addSchool(School school);
    Integer uptSchool(School school);
    Integer delSchool(int id);
}
