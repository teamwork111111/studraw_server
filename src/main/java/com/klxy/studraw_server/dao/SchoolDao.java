package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.School;
import org.apache.ibatis.annotations.Select;

public interface SchoolDao {
    /**
     * 按schid查询学校
     * @param schid
     * @return
     */
    @Select("SELECT * FROM school where id = #{schid}")
    School getSchoolBySchid(String schid);
}
