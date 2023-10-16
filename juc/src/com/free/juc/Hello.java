package com.free.juc;

/**
 * @author free
 * @create 2023-06-06-15:40
 */
public class Hello {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("hello,juc");
        },"t2");
        t1.start();

    }
}
