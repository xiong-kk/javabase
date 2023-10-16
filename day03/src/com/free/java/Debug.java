package com.free.java;

import org.junit.Test;

/**
 * @author free
 * @create 2022-12-24-12:44
 */
public class Debug {
    @Test
    public void testStringBuffer(){
        String str=null;
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer(str);
        System.out.println(sb1);

    }
}
