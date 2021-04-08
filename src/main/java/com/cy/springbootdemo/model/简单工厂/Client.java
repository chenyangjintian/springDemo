package com.cy.springbootdemo.model.简单工厂;

/**
 * @Author chenyjt
 * @Date 2020/12/23
 **/
public class Client {
    public static void main(String[] args) {
        FactoryManager.getProduct("1").show();
        FactoryManager.getProduct("2").show();
    }

    interface Product {
        void show();
    }

    public static class P1 implements Product {

        @Override
        public void show() {
            System.out.println("这是P1");
        }
    }

    public static class P2 implements Product {

        @Override
        public void show() {
            System.out.println("这是P2");
        }
    }

    static class FactoryManager {
        public static Product getProduct(String key) {
            switch (key) {
                case "1":
                    return new P1();
                case "2":
                    return new P2();
            }
            return null;
        }
    }

}
