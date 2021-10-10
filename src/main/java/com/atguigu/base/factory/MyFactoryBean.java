package com.atguigu.base.factory;

import com.atguigu.base.entity.Book;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Book> {

    public Book getObject() throws Exception {
        Book book = new Book();
        book.setAuthorName("左明登");
        book.setBookName("hahaha");
        book.setType("悬疑");
        return book;
    }

    public Class<?> getObjectType() {
        return Book.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
