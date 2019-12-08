package com.klxy.studraw_server.service.impl;

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
    public List<Feedback> getAllFeedback() {
        return feedbackDao.getAllFeedback();
    }

    @Override
    public List<Feedback> getFeedbackBysumid(int sumid) {
        return feedbackDao.getFeedbackBysumid(sumid);
    }

    @Override
    public List<Feedback> getFeedbackByuserid(int userid) {
        return feedbackDao.getFeedbackByuserid(userid);
    }
}
