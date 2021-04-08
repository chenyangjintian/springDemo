package com.cy.springbootdemo.thread;

/**
 * @Author chenyjt
 * @Date 2020/12/14
 **/
public class ThreadDemo1 {
    private volatile int count = 10;

    class Demo1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + " 卖票：ticket " + count--);
                }
            }
        }
    }


    public static void main(String[] args) {
        ThreadDemo1 my1 = new ThreadDemo1();
        ThreadDemo1 my2 = new ThreadDemo1();
        ThreadDemo1 my3 = new ThreadDemo1();

    }
}
