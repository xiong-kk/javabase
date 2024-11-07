package com.free.java;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author free
 * @create 2024-11-07-11:48
 */
public class OtherClassTest {
    @Test
    public void test(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion:"+javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome:"+javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("osName:"+osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("osVersion:"+osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("userName:"+userName);

        String userHome = System.getProperty("user.home");
        System.out.println("userHome:"+userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("userDir:"+userDir);
    }

    @Test
    public void test1(){
        BigInteger bi=new BigInteger("12345468790554566576879906");
        BigDecimal bd=new BigDecimal("12345.754549654");
        BigDecimal bd1=new BigDecimal("11");
        System.out.println(bi);
        System.out.println(bd.divide(bd1,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd1,15,BigDecimal.ROUND_HALF_UP));
    }
}
