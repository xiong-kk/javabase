package com.free.java;

/**
 * @author free
 * @create 2024-11-05-1:20
 * thread类中常用的方法
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread t1=new HelloThread();
        //设置线程名
        t1.setName("线程一");
        //启动线程，并执行run方法
        t1.start();

        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                //获取线程名
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            if(i==20){
                try {
                    //此时主线程阻塞，执行t1线程，直到t1线程执行完毕。
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        //判断线程是否存活
        System.out.println(t1.isAlive());
    }

}
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                try {
                    //当前线程休眠，单位为毫秒
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            /*if(i%20==0){
                //线程让步
                yield();
            }*/
        }
    }
}
