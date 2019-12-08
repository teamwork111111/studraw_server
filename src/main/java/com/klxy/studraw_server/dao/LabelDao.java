package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Label;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LabelDao {

    @Select("select * from label")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Label> getAllLabel();

    /**
     * 按 userid 查询label标签，一个user多次评测可以得到多个标签，放回List
     * @param userid
     * @return
     */
    @Select("SELECT * FROM label where userid = #{userid}")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Label> getLabelByuserid(int userid);


}
