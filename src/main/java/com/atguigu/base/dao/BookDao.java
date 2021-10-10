package com.atguigu.base.dao;

import com.atguigu.base.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends BaseDao<Book> {

    public void save() {
        System.out.println("图书的保存！");
    }
}
