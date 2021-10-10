package com.atguigu.base.service;

import com.atguigu.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    private BaseDao<T> BaseDao;

    public void save(){
        BaseDao.save();
    }
}
