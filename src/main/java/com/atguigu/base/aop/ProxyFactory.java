package com.atguigu.base.aop;

import com.atguigu.base.aop.MyInvocationHandler;

import java.lang.reflect.Proxy;

public class ProxyFactory<T> {

    /**
     * obj 被代理对象
     * @param obj
     * @return
     */
    public T getProxyInstance(T obj){

        T proxyInstance =(T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new MyInvocationHandler(obj));

        return proxyInstance;
    }
}
