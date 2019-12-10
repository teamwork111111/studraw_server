package com.klxy.studraw_server.service.impl;

import com.klxy.studraw_server.dao.MajorDao;
import com.klxy.studraw_server.model.Major;
import com.klxy.studraw_server.service.MajorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {
    @Resource
    MajorDao majorDao;


    @Override
    public Major getMajorByMajid(int majid) {
        return majorDao.getMajorByMajid(majid);
    }

    @Override
    public List<Major> getAllMajor() {
        return majorDao.getAllMajor();
    }

    @Override
    public Integer addMajor(Major major) {
        return majorDao.addMajor(major);
    }

    @Override
    public Integer uptMajor(Major major) {
        return majorDao.uptMajor(major);
    }

    @Override
    public Integer delMajorByid(int id) {
        return majorDao.delMajorByid(id);
    }
}
