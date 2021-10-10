package com.atguigu.base.dao;

import com.atguigu.base.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User>{

    public void save(){
        System.out.println("保存用户信息！");
    }
}
