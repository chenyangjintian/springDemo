package com.cy.springbootdemo.model.原型模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenyjt
 * @Date 2020/12/22
 **/
public class ShapeManager {

    private Map<String, Shape> map = new HashMap<>();

    public ShapeManager() {
        map.put("Circle", new Circle());
        map.put("Square", new Square());
    }

    public void addShape(String key, Shape value) {
        map.put(key, value);
    }

    public Object getShape(String key) {
        Shape shape = map.get(key);
        return shape.clone();
    }

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();
        Shape shape1 = (Shape) shapeManager.getShape("Circle");
        shape1.getArea();
        Shape shape2 = (Shape) shapeManager.getShape("Square");
        shape2.getArea();
    }
}
