package com.cy.springbootdemo.model.原型模式;

/**
 * @Author chenyjt
 * @Date 2020/12/22
 **/
public class Square implements Shape {
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
        }
        return null;
    }

    @Override
    public void getArea() {
        System.out.println("计算一个方形的面积");
    }
}
