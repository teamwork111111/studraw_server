package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.Label;
import com.klxy.studraw_server.model.Schoolmajor;
import com.klxy.studraw_server.service.LabelService;
import com.klxy.studraw_server.service.SchoolmajorServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/label")
public class LabelController {
    @Autowired
    LabelService labelService;

    /**
     * 查询所有label标签
     * 浏览器测试：http://localhost:8081/api/label/getAllLabel
     * @return
     */
    @RequestMapping("/getAllLabel")
    public List<Label> getAllLabel(){
        return labelService.getAllLabel();
    }

    /**
     * 按userid查询label标签
     * 浏览器测试：http://localhost:8081/api/label/getLabelByuserid?userid=1
     * @return
     */
    @RequestMapping("/getLabelByuserid")
    public List<Label> getLabelByuserid(int userid){
        return labelService.getLabelByuserid(userid);
    }

    //++

    /**
     * 新增Label
     * http://localhost:8081/api/label/addLabel?userid=1&labellist=测试新增&remark=测试
     * @param label
     * @return
     */
    @RequestMapping("/addLabel")
    public Integer addLabel(Label label) {
        return labelService.addLabel(label);
    }

    /**
     * 更新Label
     * http://localhost:8081/api/label/uptLabel?id=8&userid=1&labellist=测试更新&remark=测试
     * @param label
     * @return
     */
    @RequestMapping("/uptLabel")
    public Integer uptLabel(Label label) {
        return labelService.uptLabel(label);
    }

    /**
     * 删除Label
     * http://localhost:8081/api/label/delLabel?id=8
     * @param id
     * @return
     */
    @RequestMapping("/delLabel")
    public Integer delLabel(int id) {
        return labelService.delLabel(id);
    }

}
