package com.cy.springbootdemo.model.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author chenyjt
 * @Date 2021/2/23
 **/
public class InvocationProxyHandler implements InvocationHandler {

    private Object object;

    public InvocationProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 调用被代理类方法
        method.invoke(object, args);
        after();
        return null;
    }

    public void before() {
        System.out.println("invoke方法调用前执行");
    }

    public void after() {
        System.out.println("invoke方法调用后执行");
    }

}
