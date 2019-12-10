package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Label;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface LabelDao {

    @Select("select * from label")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Label> getAllLabel();

    /**
     * 按 userid 查询label标签，一个user多次评测可以得到多个标签，放回List
     * @param userid
     * @return
     */
    @Select("SELECT * FROM label where userid = #{userid}")
    @Results(value = {
            @Result(property = "userid",column = "userid"),
            @Result(property="user",column="userid",one=@One(select="com.klxy.studraw_server.dao.UserDao.getUserByid"))
    })
    List<Label> getLabelByuserid(int userid);

    /**
     * 新增Label
     * @param label
     * @return
     */
    @Insert("insert into label values(default,#{userid},default,#{labellist},#{remark})")
    Integer addLabel(Label label);

    /**
     * 更新Label
     * @param label
     * @return
     */
    @Update("update label set labellist=#{labellist},remark=#{remark} where id = #{id}")
    Integer uptLabel(Label label);

    /**
     * 删除Label
     * @param id
     * @return
     */
    @Delete("delete from label where id = #{id}")
    Integer delLabel(int id);


}
