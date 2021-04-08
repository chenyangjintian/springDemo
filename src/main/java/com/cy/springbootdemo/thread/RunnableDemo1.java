package com.cy.springbootdemo.thread;

/**
 * @Author chenyjt
 * @Date 2020/12/14
 **/
public class RunnableDemo1 {

    public static void main(String[] args) {
        class MyRunnable implements Runnable{
            private int ticket=10;
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    if(this.ticket>0){
                        System.out.println(Thread.currentThread().getName()+" 卖票：ticket "+this.ticket--);
                    }
                }

            }

        }

        // 启动3个线程t1,t2,t3(它们共用一个Runnable对象)，这3个线程一共卖10张票！这说明它们是共享了MyRunnable接口的。
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
