package com.free.java;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * @author free
 * @create 2024-11-05-15:02
 * Lock锁，5.0之后增加的方式
 */
public class LockTest {
    public static void main(String[] args) {
        Windows w=new Windows();
        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        Thread t3=new Thread(w);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}
class Windows implements Runnable{
    private int ticket=100;
    //实例化lock
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                //调用lock方法
                lock.lock();
                if (ticket > 0) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //调用解锁方法
                lock.unlock();
            }
        }
    }
}
