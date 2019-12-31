package com.klxy.studraw_server.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.klxy.studraw_server.dao.FeedbackDao;
import com.klxy.studraw_server.model.Feedback;
import com.klxy.studraw_server.service.FeedbackService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Resource
    FeedbackDao feedbackDao;


    @Override
    public Object getAllFeedback(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Feedback> allFeedback = feedbackDao.getAllFeedback();
        PageInfo<Feedback> pageInfo = new PageInfo<>(allFeedback);
        return pageInfo;
    }

    @Override
    public List<Feedback> getFeedbackBysumid(int sumid) {
        return feedbackDao.getFeedbackBysumid(sumid);
    }

    @Override
    public List<Feedback> getFeedbackBysumid1(int sumid) {
        return feedbackDao.getFeedbackBysumid1(sumid);
    }

    @Override
    public List<Feedback> getFeedbackByuserid(int userid) {
        return feedbackDao.getFeedbackByuserid(userid);
    }

    @Override
    public Integer addFeedback(Feedback feedback) {
        return feedbackDao.addFeedback(feedback);
    }

    @Override
    public Integer delFeedback(int id) {
        return feedbackDao.delFeedback(id);
    }
}
