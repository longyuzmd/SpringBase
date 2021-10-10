package com.atguigu.base;

import com.atguigu.base.entity.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("autoandel.xml");

    @Test
    public void testAuto(){
        Person bean = ioc.getBean(Person.class);
        System.out.println(bean);
    }
}
