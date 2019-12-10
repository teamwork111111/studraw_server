package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Feedback;
import com.klxy.studraw_server.model.Summary;
import com.klxy.studraw_server.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/summary")
public class SummaryController {
    @Autowired
    SummaryService summaryService;

    /**
     * 查询所有summary
     * 浏览器测试：http://localhost:8081/api/summary/getAllSummary
     * @return
     */
    @RequestMapping("/getAllSummary")
    public List<Summary> getAllSummary(){
        return summaryService.getAllSummary();
    }

    /**
     * 条件查询summary
     * 按userid查询，按content模糊查询，按createtime时间段查询
     * 浏览器测试：
     * http://localhost:8081/api/summary/getSummaryByCondition?userid=1
     * http://localhost:8081/api/summary/getSummaryByCondition?content=一般
     *
     *
     * 如下方式不行
     * http://localhost:8081/api/summary/getSummaryByCondition?userid=1&content=''&createtime1=''&createtime2=''
     * http://localhost:8081/api/summary/getSummaryByCondition?content=一般
     * http://localhost:8081/api/summary/getSummaryByCondition?createtime1=2019-12-02&createtime2=2019-12-05
     * @param summary
     * @return
     */
    @RequestMapping("/getSummaryByCondition")
    public List<Summary> getSummaryByCondition(Summary summary){
        return summaryService.getSummaryByCondition(summary);
    }

    /**
     * 按id查询Summary
     * http://localhost:8081/api/summary/getSummaryByid/1
     * @param id
     * @return
     */
    @RequestMapping("/getSummaryByid")
    public Summary getSummaryByid(int id){
        return summaryService.getSummaryByid(id);
    }


    /**
     * 新增summary
     * http://localhost:8081/api/summary/addSummary?userid=1&content=测试新增&hide=0
     * @param summary
     * @return
     */
    @RequestMapping("/addSummary")
    public Integer addSummary(Summary summary) {
        return summaryService.addSummary(summary);
    }

    /**
     * 更新summary
     * http://localhost:8081/api/summary/uptSummary?id=1&content=测试更新&hide=0
     * @param summary
     * @return
     */
    @RequestMapping("/uptSummary")
    public Integer uptSummary(Summary summary) {
        return summaryService.uptSummary(summary);
    }

    /**
     * 删除summary
     * http://localhost:8081/api/summary/delSummary?id=7
     * @param id
     * @return
     */
    @RequestMapping("/delSummary")
    public Integer delSummary(int id) {
        return summaryService.delSummary(id);
    }

}
