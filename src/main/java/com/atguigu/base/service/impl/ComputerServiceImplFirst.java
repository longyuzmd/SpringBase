package com.atguigu.base.service.impl;

import com.atguigu.base.dao.ComputerDao;
import com.atguigu.base.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImplFirst implements ComputerService {

    @Autowired
    private ComputerDao computerDao;

    public void save() {
        computerDao.save();
        System.out.println("first");
    }
}
