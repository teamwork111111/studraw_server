package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Role;

import java.util.List;

public interface RoleService {
    //查询
    Role getRoleByRoleid(int roleid);

    List<Role> getAllRole();

    Integer addRole(Role role);

    Integer uptRole(Role role);

    Integer delRole(int id);
}
