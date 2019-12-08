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
     * 安装id查询用户
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    @Results(value = {
            @Result(property = "userinfoid",column = "userinfoid"),
            @Result(property = "roleid",column = "roleid"),
            @Result(property="userinfo",column="userinfoid",one=@One(select="com.klxy.studraw_server.dao.UserinfoDao.getUserinfoByUserinfoid")),
            @Result(property="role",column="roleid",one=@One(select="com.klxy.studraw_server.dao.RoleDao.getRoleByRoleid"))
    })
    User getUserByid(int id);

    /**
     * 用户登录方法
     * @param username
     * @param password
     * @return
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(String username, String password);

    /**
     * 注册用户
     * @param user
     * @return
     */
    @Insert("insert into user(username,password,roleid) values (#{username},#{password},#{roleid})")
    Integer insert(User user);

    /**
     * 用户写完UserInfo表基本信息后，返回来更新User表的userinfoid即，User userinfoid = UserInfo id
     * @param id
     * @param userinfoid
     * @return
     */
    @Update("update user set userinfoid=#{userinfoid} where id=#{id}")
    Integer adduserinfoid(@Param("id") int id, @Param("userinfoid") int userinfoid);

    /**
     * 动态条件更新用户账号、密码、状态
     * @param user
     * @return
     */
    Integer uptUserByCondition(User user);

    /**
     * 删除用户
     * 这里没有设置联级删除用户信息表，
     * @param id
     * @return
     */
    @Delete("delete from user where id =#{id}")
    Integer delUser(int id);
}
