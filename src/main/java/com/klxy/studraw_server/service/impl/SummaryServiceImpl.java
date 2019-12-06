package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.RoleDao;
import com.klxy.studraw_server.dao.SummaryDao;
import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.model.Summary;
import com.klxy.studraw_server.service.RoleService;
import com.klxy.studraw_server.service.SummaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SummaryServiceImpl implements SummaryService {
    @Resource
    SummaryDao summaryDao;


    @Override
    public List<Summary> getAllSummary() {
        return summaryDao.getAllSummary();
    }
}
