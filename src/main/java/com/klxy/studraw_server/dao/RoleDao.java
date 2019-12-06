package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Role;
import org.apache.ibatis.annotations.Select;


public interface RoleDao {
    //查询
    @Select("SELECT * FROM role where id = #{roleid}")
    Role getRoleByRoleid(int roleid);
}
