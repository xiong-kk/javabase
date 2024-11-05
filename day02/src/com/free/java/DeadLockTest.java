package com.free.java;

import static java.lang.Thread.sleep;

/**
 * @author free
 * @create 2024-11-05-14:51
 * 死锁的显示
 */
public class DeadLockTest {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        new Thread(){
            @Override
            public void run(){
                synchronized (s1){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s1.append("a");
                    s2.append("1");
                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
                    @Override
                    public void run() {
                        synchronized (s2){
                            try {
                                sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            s1.append("c");
                            s2.append("3");
                            synchronized (s1){
                                s1.append("d");
                                s2.append("4");
                                System.out.println(s1);
                                System.out.println(s2);
                            }
                        }

                    }
                }
        ).start();
    }
}
