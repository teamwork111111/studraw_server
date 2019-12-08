package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.LabelDao;
import com.klxy.studraw_server.dao.RoleDao;
import com.klxy.studraw_server.model.Label;
import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.service.LabelService;
import com.klxy.studraw_server.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {
    @Resource
    LabelDao labelDao;


    @Override
    public List<Label> getAllLabel() {
        return labelDao.getAllLabel();
    }

    @Override
    public List<Label> getLabelByuserid(int userid) {
        return labelDao.getLabelByuserid(userid);
    }
}
