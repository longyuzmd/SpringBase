package com.atguigu.base;

import com.atguigu.base.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBaseTest {

    public static void main(String[] args) {
        // xml的形式
//        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("tx.xml");

        // 注解的形式
        AnnotationConfigApplicationContext cpa = new AnnotationConfigApplicationContext("com.atguigu.base");

        Person person =(Person) cpa.getBean("person");

        System.out.println(person.getName());


    }
}
