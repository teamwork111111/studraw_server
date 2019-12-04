package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Schoolmajor;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SchoolmajorDao {
    /**
     * 查询所有学校及专业
     * @return
     */
    @Select("select * from schoolmajor")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getMajorByMajid"))
    })
    List<Schoolmajor> getAllSchoolMajor();

    @Select("select * from schoolmajor where id = #{smid}")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getMajorByMajid"))
    })
    Schoolmajor getSchoolMajorByid(String smid);

}
