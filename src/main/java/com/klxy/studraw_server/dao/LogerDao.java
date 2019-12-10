package com.klxy.studraw_server.dao;


import com.klxy.studraw_server.model.Loger;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface LogerDao {
    /**
     * 查询所有loger
     * @return
     */
    @Select("select * from loger")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Loger> getAllLoger();

    /**
     * 新增loger
     * @param loger
     * @return
     */
    @Insert("insert into loger values(default,#{userid},default,#{logip})")
    Integer addLoger(Loger loger);

    /**
     * 按id删除loger
     * @param id
     * @return
     */
    @Delete("delete from loger where id = #{id}")
    Integer delLogerByid(int id);

    /**
     * 按userid删除loger
     * @param userid
     * @return
     */
    @Delete("delete from loger where userid = #{userid}")
    Integer delLogerByuserid(int userid);

}
