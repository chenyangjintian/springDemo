package com.cy.springbootdemo.model.原型模式;

import lombok.Data;

/**
 * 原型模式
 * @Author chenyjt
 * @Date 2020/12/22
 **/
@Data
public class RealizeType implements Cloneable {

    public static void main(String[] args) {
        RealizeType r1 = new RealizeType("A1");
        r1.display();
        try {
            RealizeType r2 = (RealizeType) r1.clone();
            r2.setName("B1");
            r2.display();
        } catch (CloneNotSupportedException e) {

        }
    }

    private String name;

    private RealizeType(String name) {
        this.name = name;
        System.out.println("创建成功");
    }

    private void display() {
        System.out.println("最终克隆结果：" + name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (RealizeType) super.clone();
    }


}
