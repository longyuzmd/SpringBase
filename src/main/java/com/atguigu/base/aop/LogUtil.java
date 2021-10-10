package com.atguigu.base.aop;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogUtil {

    private static ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("tx.xml");

    public static void logBefore(){
        Object person = ioc.getBean("person02");
        System.out.println("【】方法的开始，参数列表为【】");
    }

    public static void logAfter(){
        System.out.println("【】方法结束了");
    }

    public static void logAfterReturning(){
        System.out.println("【】方法的执行完成，计算结果返回为");
    }

    public static void logAfterThrowing(){
        System.out.println("【】方法执行出现异常");
    }
}
