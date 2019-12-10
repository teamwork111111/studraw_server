package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Loger;
import com.klxy.studraw_server.model.Major;
import com.klxy.studraw_server.service.LogerService;
import com.klxy.studraw_server.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/major")
public class MajorController {
    @Autowired
    MajorService majorService;

    /**
     * 按id查询major
     * 浏览器测试：http://localhost:8081/api/major/getMajorByMajid?majid=1
     * @param majid
     * @return
     */
    @RequestMapping("/getMajorByMajid")
    public Major getMajorByMajid(int majid){
        return majorService.getMajorByMajid(majid);
    }

    /**
     * 查询所有major
     * http://localhost:8081/api/major/getAllMajor
     * @return
     */
    @RequestMapping("/getAllMajor")
    public List<Major> getAllMajor(){
        return majorService.getAllMajor();
    }

    /**
     * 新增major
     * http://localhost:8081/api/major/addMajor?majname=测试新增&remark=测试
     * @param major
     * @return
     */
    @RequestMapping("/addMajor")
    public Integer addMajor(Major major){
        return majorService.addMajor(major);
    }

    /**
     * 测试更新
     * http://localhost:8081/api/major/uptMajor?majname=测试更新&remark=测试&id=5
     * @param major
     * @return
     */
    @RequestMapping("/uptMajor")
    public Integer uptMajor(Major major){
        return majorService.uptMajor(major);
    }

    /**
     * 删除major
     * http://localhost:8081/api/major/delMajorByid?id=4
     * @param id
     * @return
     */
    @RequestMapping("/delMajorByid")
    public Integer delMajorByid(int id){
        return majorService.delMajorByid(id);
    }
}
