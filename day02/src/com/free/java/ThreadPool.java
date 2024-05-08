package com.free.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author free
 * @create 2024-05-08-21:56
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        service1.setCorePoolSize(15);


        service1.execute(new NumberThread());
        service1.submit(new NumThread());
        //关闭线程池
        service1.shutdown();
    }
}

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
