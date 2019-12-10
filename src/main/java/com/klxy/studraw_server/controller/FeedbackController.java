package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Feedback;
import com.klxy.studraw_server.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/feedback") //每个控制类定义一个统一的链接，避免与其他控制类冲突  访问该类用：http://localhost:8081/api/user/xxx
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    /**
     * 测试查询所有评论
     * http://localhost:8081/api/feedback/getAllFeedback
     *
     * @return
     */
    @RequestMapping("/getAllFeedback")
    public List<Feedback> getAllFeedback(){
        return feedbackService.getAllFeedback();
    }

    /**
     * 按sumid查询评论
     * http://localhost:8081/api/feedback/getFeedbackBysumid?sumid=1
     * @param sumid
     * @return
     */
    @RequestMapping("/getFeedbackBysumid")
    public List<Feedback> getFeedbackBysumid(int sumid){
        return feedbackService.getFeedbackBysumid(sumid);
    }

    /**
     * 按评论人userid查询评论
     * http://localhost:8081/api/feedback/getFeedbackByuserid?userid=2
     * @param userid
     * @return
     */
    @RequestMapping("/getFeedbackByuserid")
    public List<Feedback> getFeedbackByuserid(int userid){
        return feedbackService.getFeedbackByuserid(userid);
    }

    /**
     * 添加评论
     * http://localhost:8081/api/feedback/addFeedback?sumid=1&content=测试添加&userid=3
     * @param feedback
     * @return
     */
    @RequestMapping("/addFeedback")
    public Integer addFeedback(Feedback feedback) {
        return feedbackService.addFeedback(feedback);
    }

    /**
     * 删除评论
     * http://localhost:8081/api/feedback/delFeedback?id=6
     * @param id
     * @return
     */
    @RequestMapping("/delFeedback")
    public Integer delFeedback(int id) {
        return feedbackService.delFeedback(id);
    }
}
