package com.free.java;

/**
 * @author free
 * @create 2024-11-05-15:24
 * 线程间通信
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
class Number implements Runnable{

    private int number=1;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                //唤醒被wait的线程
                notifyAll();
                if(number<=100){
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        //阻塞并释放锁
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }

        }
    }
}

