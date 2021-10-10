package com.atguigu.base.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler<T> implements InvocationHandler {

    private T obj;

    public MyInvocationHandler(T obj){
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增加日志
        Object invoke = null;
        try {
            LogUtil.logBefore();
            invoke = method.invoke(obj, args);
            LogUtil.logAfterReturning();
        }catch (Exception e){
            LogUtil.logAfterThrowing();
        }finally {
            LogUtil.logAfter();
        }
        return invoke;
    }
}
