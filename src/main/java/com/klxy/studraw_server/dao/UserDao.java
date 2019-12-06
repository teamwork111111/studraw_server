package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    /**
     * 查询用户，采用xml形式查询，复杂的联合查询最好用xml形式。
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询user，采用注解形式
     * 一句@Result(property = "roleid",column = "roleid")表示，
     * 手动映射roleid,避免自动映射时roleid作为传递给select语句之后，找不到roleid变为空值
     * @return
     */
    @Select("select * from user")
    @Results(value = {
            @Result(property = "userinfoid",column = "userinfoid"),
            @Result(property = "roleid",column = "roleid"),
            @Result(property="userinfo",column="userinfoid",one=@One(select="com.klxy.studraw_server.dao.UserinfoDao.getUserinfoByUserinfoid")),
            @Result(property="role",column="roleid",one=@One(select="com.klxy.studraw_server.dao.RoleDao.getRoleByRoleid"))
    })
    List<User> getAllUser1();

    /**
     * 用户登录方法
     * @param username
     * @param password
     * @return
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(String username, String password);

    //插入
    Integer insert(User user);
}
