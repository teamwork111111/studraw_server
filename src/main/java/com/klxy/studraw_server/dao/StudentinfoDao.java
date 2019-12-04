package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Studentinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentinfoDao {
    @Select("select * from studentinfo")
    @Results(value = {
            @Result(property = "smid",column = "smid"),
            @Result(property="schoolmajor",column="smid",one=@One(select="com.klxy.studraw_server.dao.SchoolmajorDao.getSchoolMajorByid"))
    })
    List<Studentinfo> getAllStudentinfo();
}
