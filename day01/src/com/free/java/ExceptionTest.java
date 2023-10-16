package com.free.java;

import org.junit.Test;

/**
 * 异常的处理
 */
public class ExceptionTest {
    @Test
    public void test1(){
        String str="hh";
        str="aa";
        try {
            int num = Integer.parseInt(str);
            System.out.println("js");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {

        }
        System.out.println("2");
    }
}
