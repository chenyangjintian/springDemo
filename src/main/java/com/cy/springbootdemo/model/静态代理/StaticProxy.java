package com.cy.springbootdemo.model.静态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author chenyjt
 * @Date 2021/2/24
 **/
public class StaticProxy implements Humen {

    private Humen target;

    public StaticProxy(Humen target) {
        this.target = target;
    }


    @Override
    public void run() {
        System.out.println("this is run");
        target.run();
    }

    @Override
    public void jump() {

    }


    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new My());
        staticProxy.run();
    }
}
