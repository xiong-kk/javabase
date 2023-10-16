package com.free.java;

import org.junit.Test;

import java.io.File;

/**
 * File类的使用
 * @author free
 * @create 2022-12-28-15:19
 */
public class FileTest {
    @Test
    public void test1(){
        //相对路径,相对于当前module
        File file1=new File("hello.txt");

        //绝对路径
        File file2=new File("E:\\program\\idea\\javabase\\day04\\he.txt");
        System.out.println(file1);
        System.out.println(file2);
    }
}
