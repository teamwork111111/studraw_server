package com.klxy.studraw_server.controller;

import com.klxy.studraw_server.model.User;
import com.klxy.studraw_server.model.Userinfo;
import com.klxy.studraw_server.service.UserService;
import com.klxy.studraw_server.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/userinfo") //每个控制类定义一个统一的链接，避免与其他控制类冲突  访问该类用：http://localhost:8081/api/user/xxx
public class UserinfoController {
    @Autowired
    UserinfoService userinfoService;

    /**
     * 查询所有userinfo
     * http://localhost:8081/api/userinfo/getAllUserinfo
     * @return
     */
    @RequestMapping("/getAllUserinfo")
    public List<Userinfo> getAllUserinfo(){
        return userinfoService.getAllUserinfo();
    }

    /**
     * 按userinfoid(id)查询userinfo
     * http://localhost:8081/api/userinfo/getUserinfoByUserinfoid?userinfoid=1
     * @param userinfoid
     * @return
     */
    @RequestMapping("/getUserinfoByUserinfoid")
    public Userinfo getUserinfoByUserinfoid(int userinfoid){
        return userinfoService.getUserinfoByUserinfoid(userinfoid);
    }

    /**
     * 新增userinfo
     * 字段id, name,sex(int),desc,image,qq,no,schid,majid,remark
     * http://localhost:8081/api/userinfo/addUserinfo?name=测试新增&sex=1&desc=测试&image=测试&qq=测试&no=测试&schid=1&majid=1&remark=测试
     * insert into userinfo values(default,'张三',1,'这是个人描述','pic','qq','201866667777',1,1,'这是备注');
     *
     * @param userinfo
     * @return
     */
    @RequestMapping("/addUserinfo")
    public Integer addUserinfo(Userinfo userinfo){
        int a = userinfoService.addUserinfo(userinfo);
        if(a==1){
            System.out.println("id为"+userinfo.getId());
            return userinfo.getId();
        }else {
            return 0;
        }
//        return userinfoService.addUserinfo(userinfo);
    }

    /**
     * 更新userinfo
     * http://localhost:8081/api/userinfo/uptUserinfo?name=测试更新&sex=1&desc=测试&image=测试&qq=测试&no=测试&schid=1&majid=1&remark=测试&id=6
     * @param userinfo
     * @return
     */
    @RequestMapping("/uptUserinfo")
    public Integer uptUserinfo(Userinfo userinfo){
        return userinfoService.uptUserinfo(userinfo);
    }

    /**
     * 按id删除userinfo
     * http://localhost:8081/api/userinfo/delUserinfo?id=6
     * @param id
     * @return
     */
    @RequestMapping("/delUserinfo")
    public Integer delUserinfo(int id){
        return userinfoService.delUserinfo(id);
    }





}
