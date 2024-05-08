package com.free.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author free
 * @create 2024-05-08-21:43
 */
public class ThreadNew {
    public static void main(String[] args) {
        NumThread t1=new NumThread();
        FutureTask futureTask = new FutureTask(t1);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            //get方法的返回值即为callable实现类中call方法的返回值，可以捕获异常
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}

/**
 * 实现callable接口
 */

class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum+=i;
            }
        }
        return sum;
    }
}
