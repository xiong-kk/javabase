package com.free.java;

/**
 * 多线程的创建
 * 通过继承Thread类
 * @author free
 * @create 2022-12-23-17:26
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
