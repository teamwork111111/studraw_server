package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Loger;

import java.util.List;

public interface LogerService {
    List<Loger> getAllLoger();
    Integer addLoger(Loger loger);
    Integer delLogerByid(int id);
    Integer delLogerByuserid(int userid);
}
