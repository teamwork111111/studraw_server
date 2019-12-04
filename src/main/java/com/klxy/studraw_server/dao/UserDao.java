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
     * @return
     */
    @Select("select * from user")
    @Results({
            @Result(property="role",column="roleid",one=@One(select="com.klxy.studraw_server.dao.RoleDao.getRoleByRoleid"))
    })
    List<User> getAllUser1();
}
