package com.klxy.studraw_server.dao;

import com.klxy.studraw_server.model.Major;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MajorDao {
    /**
     * 按majid查询专业所有的信息
     * @param majid
     * @return
     */
    @Select("SELECT * FROM major where id = #{majid}")
    Major getMajorByMajid(int majid);

    /**
     * 按majid查询专业必要的信息
     * @param majid
     * @return
     */
    @Select("SELECT majname FROM major where id = #{majid}")
    Major getSimpleMajorByMajid(int majid);

    /**
     * 查询所有major
     * @return
     */
    @Select("select * from major")
    List<Major> getAllMajor();

    /**
     * 新增major
     * @param major
     * @return
     */
    @Insert("insert into major(majname,remark) values(#{majname},#{remark})")
    Integer addMajor(Major major);

    /**
     * 按id更新major
     * @param major
     * @return
     */
    @Update("update major set majname=#{majname},remark=#{remark} where id=#{id}")
    Integer uptMajor(Major major);

    /**
     * 按id删除major
     * @param id
     * @return
     */
    @Delete("delete from major where id = #{id}")
    Integer delMajorByid(int id);


}
