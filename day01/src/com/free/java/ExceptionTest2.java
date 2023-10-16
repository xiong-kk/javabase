package com.free.java;

import org.junit.Test;

/**
 * 异常处理方式二：throws+异常类型
 */
public class ExceptionTest2 {
    @Test
    public void test1() throws Exception{
        String str="hh";
        str="aa";

        int num = Integer.parseInt(str);


    }
}
