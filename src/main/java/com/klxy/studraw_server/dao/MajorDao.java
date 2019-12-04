package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Major;
import org.apache.ibatis.annotations.Select;

public interface MajorDao {
    /**
     * 按majid查询专业
     * @param majid
     * @return
     */
    @Select("SELECT * FROM major where id = #{majid}")
    Major getMajorByMajid(String majid);
}
