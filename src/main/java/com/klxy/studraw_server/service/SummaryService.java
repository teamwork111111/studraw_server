package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Role;
import com.klxy.studraw_server.model.Summary;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SummaryService {

    List<Summary> getAllSummary();

    List<Summary> getSummaryByCondition(Summary summary);
    /*List<Summary> getSummaryByCondition(int userid, String content,String createtime1, String createtime2);*/

    Summary getSummaryByid(int id);


    Integer addSummary(Summary summary);
    Integer uptSummary(Summary summary);
    Integer delSummary(int id);
}
