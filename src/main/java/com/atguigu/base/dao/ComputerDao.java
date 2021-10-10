package com.atguigu.base.dao;

import com.atguigu.base.entity.Computer;
import org.springframework.stereotype.Repository;

@Repository
public class ComputerDao extends BaseDao<Computer> {

    public void save() {
        System.out.println("保存电脑信息！");
    }
}
