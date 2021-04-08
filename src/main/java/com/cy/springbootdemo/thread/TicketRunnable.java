package com.cy.springbootdemo.thread;

/**
 * @Author chenyjt
 * @Date 2020/12/15
 **/
public class TicketRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            while (count > 1) {
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (this){
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + count-- + "张票");
                }

            }
        }
    }

    private int count = 10;


    public static void main(String[] args) {
//        System.out.println("线程开始");
//        TicketRunnable ticketRunnable = new TicketRunnable();
//        Thread thread1 = new Thread(ticketRunnable, "一号窗口");
//        Thread thread2 = new Thread(ticketRunnable, "二号窗口");
//        thread1.start();
//        thread2.start();

    }
}
