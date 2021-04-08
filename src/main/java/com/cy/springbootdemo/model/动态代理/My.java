package com.cy.springbootdemo.model.动态代理;

/**
 * @Author chenyjt
 * @Date 2021/2/23
 **/
public class My implements Humen {
    @Override
    public void run() {
        System.out.println(this.getClass().getName() + "***跑起来");
    }

    @Override
    public void jump() {
        System.out.println(this.getClass().getName() + "人***跳起来");
    }
}
