package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Feedback;
import org.apache.ibatis.annotations.*;

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
     * 按sumid查询评论,不查summary信息
     * @param sumid
     * @return
     */
    @Select("select * from feedback where sumid = #{sumid}")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Feedback> getFeedbackBysumid1(int sumid);

    /**
     * 按sumid查询简单版的评论,不查summary信息,只查必要信息
     * @param sumid
     * @return
     */
    @Select("select createtime,content,userid from feedback where sumid = #{sumid}")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getSimpleUserByid"))
    })
    List<Feedback> getSimpleFeedbackBysumid1(int sumid);

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


    /**
     * 新增Feedback
     * @param feedback
     * @return
     */
    @Insert("insert into feedback values(default, #{sumid},default,#{content},#{userid})")
    Integer addFeedback(Feedback feedback);

    /**
     * 按id删除Feedback
     * @param id
     * @return
     */
    @Delete("delete from feedback where id = #{id}")
    Integer delFeedback(int id);
}
