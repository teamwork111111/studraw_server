package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.RoleDao;
import com.klxy.studraw_server.dao.UserDao;
import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.model.User;
import com.klxy.studraw_server.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleDao roleDao;

    @Override
    public Role getRoleByRoleid(int roleid) {
        return roleDao.getRoleByRoleid(roleid);
    }

    @Override
    public List<Role> getAllRole() {
        return roleDao.getAllRole();
    }

    @Override
    public Integer addRole(Role role) {
        return roleDao.addRole(role);
    }

    @Override
    public Integer uptRole(Role role) {
        return roleDao.uptRole(role);
    }

    @Override
    public Integer delRole(int id) {
        return roleDao.delRole(id);
    }
}
