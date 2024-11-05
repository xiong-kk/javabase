package com.free.java;

/**
 * @author free
 * @create 2024-05-08-21:31
 * 实现runnable接口方式
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 myThread1= new MyThread1();
        Thread t1= new Thread(myThread1);
        Thread t2=new Thread(myThread1);
        t1.start();
        t2.start();

    }

}

/**
 * 实现runnable接口
 */
class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
