package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    /**
     * 查询用户，不包括关联的role角色
     * @return
     */
    List<User> getAllUser();//采用注解方式或UserMapper XML的方式都可以实现分页查询

    /**
     * 查询user，包含role角色
     * @return
     */
    @Select("select * from user")
    @Results({
            @Result(property="role",column="roleid",one=@One(select="com.klxy.studraw_server.dao.RoleDao.getRoleByRoleid"))
    })
    List<User> getAllUser1();
}
