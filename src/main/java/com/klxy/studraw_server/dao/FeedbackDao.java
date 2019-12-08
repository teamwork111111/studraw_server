package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Feedback;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface FeedbackDao {
    /**
     * 查询所有评论
     * http://localhost:8081/api/feedback/getAllFeedback
     * @return
     */
    @Select("select * from feedback")
    @Results(value = {
            @Result(property = "sumid",column = "sumid"),
            @Result(property = "userid",column = "userid"),
            @Result(property="summary",column="sumid",one=@One(select="com.klxy.studraw_server.dao.SummaryDao.getSummaryByid")),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Feedback> getAllFeedback();

    /**
     * 按sumid查询评论
     * @param sumid
     * @return
     */
    @Select("select * from feedback where sumid = #{sumid}")
    @Results(value = {
            @Result(property = "sumid",column = "sumid"),
            @Result(property = "userid",column = "userid"),
            @Result(property="summary",column="sumid",one=@One(select="com.klxy.studraw_server.dao.SummaryDao.getSummaryByid")),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Feedback> getFeedbackBysumid(int sumid);

    /**
     * 按评论人userid查询评论
     * @param userid
     * @return
     */
    @Select("select * from feedback where userid = #{userid}")
    @Results(value = {
            @Result(property = "sumid",column = "sumid"),
            @Result(property = "userid",column = "userid"),
            @Result(property="summary",column="sumid",one=@One(select="com.klxy.studraw_server.dao.SummaryDao.getSummaryByid")),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Feedback> getFeedbackByuserid(int userid);
}
