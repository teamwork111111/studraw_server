package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Loger;
import com.klxy.studraw_server.model.Userinfo;

import java.util.List;

public interface UserinfoService {
    List<Userinfo> getAllUserinfo();
    Userinfo getUserinfoByUserinfoid(int userinfoid);
    Integer addUserinfo(Userinfo userinfo);
    Integer uptUserinfo(Userinfo userinfo);
    Integer delUserinfo(int id);
}
