package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserinfoDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from userinfo")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getMajorByMajid"))
    })
    List<Userinfo> getAllUserinfo();

    /**
     * 按id查询所有的Userinfo信息
     * @param userinfoid
     * @return
     */
    @Select("SELECT * FROM userinfo where id = #{userinfoid}")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getMajorByMajid"))
    })
    Userinfo getUserinfoByUserinfoid(int userinfoid);

    /**
     * 按id查询必要的Userinfo信息
     * @param userinfoid
     * @return
     */
    @Select("SELECT name,sex,image,schid,majid FROM userinfo where id = #{userinfoid}")
    @Results(value = {
            @Result(property = "schid",column = "schid"),
            @Result(property = "majid",column = "majid"),
            @Result(property="school",column="schid",one=@One(select="com.klxy.studraw_server.dao.SchoolDao.getSimpleSchoolBySchid")),
            @Result(property="major",column="majid",one=@One(select="com.klxy.studraw_server.dao.MajorDao.getSimpleMajorByMajid"))
    })
    Userinfo getSimpleUserinfoByUserinfoid(int userinfoid);



    /**
     * 新增Userinfo
     * @param userinfo
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into userinfo(name,sex,userinfo.desc,image,qq,no,schid,majid,remark) values(#{name},#{sex},#{desc},#{image},#{qq},#{no},#{schid},#{majid},#{remark})")
    Integer addUserinfo(Userinfo userinfo);

    /**
     * 更新userinfo
     * desc为mysql关键字，所以写成userinfo.desc
     * @param userinfo
     * @return
     */
    /*id, name,sex(int),desc,image,qq,no,schid,majid,remark*/
    @Update("update userinfo set name=#{name},sex=#{sex},userinfo.desc=#{desc},image=#{image},qq=#{qq},no=#{no},schid=#{schid},majid=#{majid},remark=#{remark} where id=#{id}")
    Integer uptUserinfo(Userinfo userinfo);

    /**
     * 删除用户信息Userinfo
     * @param id
     * @return
     */
    @Delete("delete from userinfo where id = #{userinfoid}")
    Integer delUserinfo(int id);


}
