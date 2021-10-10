package com.atguigu.base;


import com.atguigu.base.controller.BookController;
import com.atguigu.base.controller.ComputerController;
import com.atguigu.base.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnoTest {

    private ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("annotation.xml");

    @Test
    public void test(){
        UserController userController = ioc.getBean(UserController.class);
        userController.save();

        BookController bookController = ioc.getBean(BookController.class);
        bookController.save();
    }

    @Test
    public void test01(){
        ComputerController com = ioc.getBean(ComputerController.class);
        com.save();
    }
}
