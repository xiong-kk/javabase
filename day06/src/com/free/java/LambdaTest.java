package com.free.java;

import org.junit.Test;

/**
 * @author free
 * @create 2023-01-07-15:37
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("三体");
            }
        };
        r1.run();


        Runnable r2=() ->System.out.println("三体2");
        r2.run();
    }
}
