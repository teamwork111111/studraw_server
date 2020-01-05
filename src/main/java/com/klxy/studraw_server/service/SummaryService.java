package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.model.Summary;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SummaryService {

    List<Summary> getAllSummary();

    /**
     * 带分页功能的查询所有Summary，附带查询Summary关联的必要信息
     * @param summary
     * @param pageNum
     * @param pageSize
     * @return
     */
    Object getAllSimpleSummary(Summary summary, int pageNum, int pageSize);

    List<Summary> getSummaryByCondition(Summary summary);

    Summary getSummaryByid(int id);

    List<Summary> getSummaryByuserid(int userid);

    Integer addSummary(Summary summary);
    Integer uptSummary(Summary summary);
    Integer delSummary(int id);
}
