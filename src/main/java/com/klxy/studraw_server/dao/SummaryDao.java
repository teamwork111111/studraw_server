package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Major;
import com.klxy.studraw_server.model.Summary;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
     * 动态查询，可以按userid查询，创建时间查询
     * @param id
     * @return
     */
    Summary getSummaryByCondition(int id);
}
