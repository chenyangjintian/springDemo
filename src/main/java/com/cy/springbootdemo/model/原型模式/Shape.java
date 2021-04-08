package com.cy.springbootdemo.model.原型模式;

/**
 * @Author chenyjt
 * @Date 2020/12/22
 **/
interface Shape extends Cloneable {

    /**
     * 克隆
     *
     * @return
     */
    Object clone();

    /**
     * 获取面积信息
     */
    void getArea();


}
