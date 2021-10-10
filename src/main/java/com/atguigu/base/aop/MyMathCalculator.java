package com.atguigu.base.aop;

import com.atguigu.base.aop.Calculator;

/**
 * 动态代理去实现动态增加日志功能
 * 动态代理模式：
 *  一个接口，定义规范，
 *      一个实现类，被代理类
 *      一个代理类
 *   调用代理类的方法，实现调用被代理类的方法，并可以对被代理类方法增加日志
 */
public class MyMathCalculator implements Calculator {

    public int add(int i, int j) {
        return i+j;
    }

    public int sub(int i, int j) {
        return i-j;
    }

    public int mul(int i, int j) {
        return i*j;
    }

    public int div(int i, int j) {
        return i/j;
    }
}
