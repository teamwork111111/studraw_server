package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Teacherinfo;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherinfoDao {
    @Select("select * from teacherinfo")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid"))
    })
    List<Teacherinfo> getAllTeacherinfo();
}
