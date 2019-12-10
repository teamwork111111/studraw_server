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

    //++
    /*  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sumid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `content` varchar(255) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,*/
    @Insert("insert into feedback values(default, #{sumid},default,#{content},#{userid})")
    Integer addFeedback(Feedback feedback);

    @Delete("delete from feedback where id = #{id}")
    Integer delFeedback(int id);
}
