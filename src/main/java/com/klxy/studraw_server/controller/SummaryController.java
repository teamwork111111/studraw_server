package com.klxy.studraw_server.controller;

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
     * 浏览器测试：
     * @return
     */
    @RequestMapping("/getAllSummary")
    public List<Summary> getAllSummary(){
        return summaryService.getAllSummary();
    }
}
