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
    public void test(){
        //相对路径,相对于当前module
        File file1=new File("hello.txt");

        //绝对路径
        File file2=new File("E:\\program\\idea\\javabase\\day04\\he.txt");
        System.out.println(file1);
        System.out.println(file2);
    }

    @Test
    public void test1(){
        File file1=new File("hello.txt");
        File file2=new File("E:\\program\\idea\\javabase\\day04\\he.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

    }

    @Test
    public void test2(){
        File file=new File("E:\\program\\idea\\javabase");
        String[] list=file.list();
        for (String s:list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f:files) {
            System.out.println(f);
        }

    }

    @Test
    public void test3(){
        File file1=new File("hello.txt");
        File file2=new File("he.txt");
        boolean b = file1.renameTo(file2);
        System.out.println(b);

        b = file2.renameTo(file1);
        System.out.println(b);

    }

    @Test
    public void test4(){
        File file1=new File("hello.txt");
        File file2=new File("E:\\program\\idea\\javabase");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
}
