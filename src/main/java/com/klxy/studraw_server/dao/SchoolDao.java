package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.School;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SchoolDao {
    /**
     * 按schid查询学校
     * @param schid
     * @return
     */
    @Select("SELECT * FROM school where id = #{schid}")
    School getSchoolBySchid(int schid);

    /**
     * 查询所有school
     * @return
     */
//    @Select("select * from school")
    List<School> getAllSchool(School school);

    /**
     * 新增school
     * @param school
     * @return
     */
    @Insert("insert into school values(default, #{schoolname}, #{code}, #{desc}, #{logo})")
    Integer addSchool(School school);

    /**
     * 更新school
     * @param school
     * @return
     */
    @Update("update school set schoolname=#{schoolname},code=#{code},school.desc=#{desc},logo=#{logo} where id = #{id}")
    Integer uptSchool(School school);

    /**
     * 按id删除school
     * @param id
     * @return
     */
    @Delete("delete from school where id = #{id}")
    Integer delSchool(int id);

}
