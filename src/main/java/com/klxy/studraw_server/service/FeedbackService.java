package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Feedback;
import com.klxy.studraw_server.model.User;

import java.util.List;

public interface FeedbackService {
    //查询所有评论
    List<Feedback> getAllFeedback();

    List<Feedback> getFeedbackBysumid(int sumid);

    List<Feedback> getFeedbackByuserid(int userid);

    //++
    Integer addFeedback(Feedback feedback);

    Integer delFeedback(int id);

}
