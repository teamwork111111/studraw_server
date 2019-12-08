package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Summary;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SummaryDao {
    /**
     * 查询所有感想/总结
     * @return
     */
    @Select("SELECT * FROM summary")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid")),
    })
    List<Summary> getAllSummary();



    /**
     * 动态查询，实现按userid查询、按content内容模糊查询summary
     * 如何实现按时间段来查询？begintime和endtime这两个字段在页面中传过来的，在model中没有这两个字段
     * @param summary
     * @return
     */
    List<Summary> getSummaryByCondition(Summary summary);
    /*List<Summary> getSummaryByCondition(@Param("userid") int userid,
                                        @Param("content") String content,
                                        @Param("createtime1") String createtime1,
                                        @Param("createtime2") String createtime2 );*/

    /**
     * 按id查询summary
     * http://localhost:8081/api/summary/getSummaryByid?id=1
     * @param id
     * @return
     */
    @Select("SELECT * FROM summary where id=#{0}")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid")),
    })
    Summary getSummaryByid(int id);

}
