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
    public Role getRoleByRoleid(String roleid) {
        return roleDao.getRoleByRoleid(roleid);
    }
}
