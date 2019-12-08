package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserinfoDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from userinfo")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getMajorByMajid"))
    })
    List<Userinfo> getAllUserinfo();

    @Select("SELECT * FROM userinfo where id = #{userinfoid}")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getMajorByMajid"))
    })
    Userinfo getUserinfoByUserinfoid(int userinfoid);

    /**
     * 删除用户信息Userinfo
     * @param id
     * @return
     */
    @Delete("delete from userinfo where id = #{userinfoid}")
    Integer delUserinfo(int id);


}
