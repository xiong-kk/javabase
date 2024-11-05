package com.free.java;

/**
 * @author free
 * @create 2024-11-05-14:25
 * 线程安全问题
 */
public class WindowTest {
    public static void main(String[] args) {
        Window w=new Window();
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
//窗口类，模拟卖票
class Window implements Runnable{
    private int ticket=100;
    //同步监视器，俗称锁
    Object obj=new Object();
    @Override
    public void run() {
        while (true){
            //同步代码
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
