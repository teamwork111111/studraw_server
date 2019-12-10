package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Major;
import com.klxy.studraw_server.model.Role;

import java.util.List;

public interface MajorService {
    Major getMajorByMajid(int majid);
    List<Major> getAllMajor();
    Integer addMajor(Major major);
    Integer uptMajor(Major major);
    Integer delMajorByid(int id);
}
