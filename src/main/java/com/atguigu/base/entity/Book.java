package com.atguigu.base.entity;

import lombok.Data;

@Data
public class Book {

    private String bookName;

    private String authorName;

    private String type;

    private void initMethod(){
        System.out.println("这是初始化方法");
    }

    private void desMethod(){
        System.out.println("这是销毁方法");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
