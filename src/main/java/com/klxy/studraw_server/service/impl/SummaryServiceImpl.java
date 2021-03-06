package com.klxy.studraw_server.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.klxy.studraw_server.dao.SummaryDao;
import com.klxy.studraw_server.model.Summary;
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

    @Override
    public Object getAllSimpleSummary(Summary summary, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Summary> allSimpleSummary = summaryDao.getAllSimpleSummary(summary);
        PageInfo<Summary> summaryPageInfo = new PageInfo<>(allSimpleSummary);
        return summaryPageInfo;
    }

    @Override
    public List<Summary> getSummaryByCondition(Summary summary) {
        return summaryDao.getSummaryByCondition(summary);
    }
    /*@Override
    public List<Summary> getSummaryByCondition(int userid, String content, String createtime1, String createtime2) {
        return summaryDao.getSummaryByCondition(userid,content,createtime1,createtime2);
    }*/

    @Override
    public Summary getSummaryByid(int id) {
        return summaryDao.getSummaryByid(id);
    }

    @Override
    public List<Summary> getSummaryByuserid(int userid) {
        return summaryDao.getSummaryByuserid(userid);
    }

    @Override
    public Integer addSummary(Summary summary) {
        return summaryDao.addSummary(summary);
    }

    @Override
    public Integer uptSummary(Summary summary) {
        return summaryDao.uptSummary(summary);
    }

    @Override
    public Integer delSummary(int id) {
        return summaryDao.delSummary(id);
    }


}
