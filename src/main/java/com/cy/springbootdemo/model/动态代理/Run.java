package com.cy.springbootdemo.model.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author chenyjt
 * @Date 2021/2/23
 **/
public class Run {

    public static void main(String[] args) {
        Humen humen=new My();
        InvocationHandler invocationProxyHandler = new InvocationProxyHandler(new My());
        Humen obj = (Humen) Proxy.newProxyInstance(humen.getClass().getClassLoader(), humen.getClass().getInterfaces(), invocationProxyHandler);
        obj.run();
//        System.out.println("....");
    }
}
