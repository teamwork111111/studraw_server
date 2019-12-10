package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface RoleDao {
    /**
     * 按roleid查询role
     * @param roleid
     * @return
     */
    @Select("SELECT * FROM role where id = #{roleid}")
    Role getRoleByRoleid(int roleid);

    /**
     * 查询所有role
     * @return
     */
    @Select("select * from role")
    List<Role> getAllRole();

    /**
     * 新增role
     * @param role
     * @return
     */
    @Insert("insert into role values(default, #{rolename}, #{permition})")
    Integer addRole(Role role);

    /**
     * 更新role
     * @param role
     * @return
     */
    @Update("update role set rolename=#{rolename},permition=#{permition} where id = #{id}")
    Integer uptRole(Role role);

    /**
     * 按id删除role
     * @param id
     * @return
     */
    @Delete("delete from role where id = #{id}")
    Integer delRole(int id);
}
