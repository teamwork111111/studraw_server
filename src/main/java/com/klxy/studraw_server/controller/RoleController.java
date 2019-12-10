package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.model.User;
import com.klxy.studraw_server.service.RoleService;
import com.klxy.studraw_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    /**
     * 按roleid查询role
     * http://localhost:8081/api/role/getRoleByRoleid?roleid=1
     * @param roleid
     * @return
     */
    @RequestMapping("/getRoleByRoleid")
    public Role getRoleByRoleid(int roleid){
        return roleService.getRoleByRoleid(roleid);
    }

    /**
     * 查询所有role
     * http://localhost:8081/api/role/getAllRole
     * @return
     */
    @RequestMapping("/getAllRole")
    public List<Role> getAllRole() {
        return roleService.getAllRole();
    }

    /**
     * 新增role
     * http://localhost:8081/api/role/addRole?rolename=test&permition=test
     * @param role
     * @return
     */
    @RequestMapping("/addRole")
    public Integer addRole(Role role) {
        return roleService.addRole(role);
    }

    /**
     * 更新role
     * http://localhost:8081/api/role/uptRole?rolename=test1&permition=test2&id=4
     * @param role
     * @return
     */
    @RequestMapping("/uptRole")
    public Integer uptRole(Role role) {
        return roleService.uptRole(role);
    }

    /**
     * 删除role
     * http://localhost:8081/api/role/delRole?id=5
     * 问题：删除还剩下id
     * @param id
     * @return
     */
    @RequestMapping("/delRole")
    public Integer delRole(int id) {
        return roleService.delRole(id);
    }

}
