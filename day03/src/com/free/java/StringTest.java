package com.free.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * String的使用
 * @author free
 * @create 2022-12-24-1:24
 */
public class StringTest {
    @Test
    public void test1(){
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
        s1="hello";
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

        String s3="abc";
        s3+="def";
        System.out.println(s3);
        System.out.println(s2);

        //replace方法并不会改变原来字符串的值
        String s4= s3.replace('a', 'k');
        System.out.println(s3);
        System.out.println(s4);
    }

    @Test
    public void test2(){
        //此时数据存储在方法区中的常量池中
        String s1="java";
        String s2="java";

        //此时数据存储在堆空间中
        String s3=new String("java");
        String s4=new String("java");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
    }

    @Test
    public void test3(){
        String s1="java";
        String s2="hadoop";
        String s3="javahadoop";
        String s4="java"+"hadoop";
        String s5=s1+"hadoop";
        String s6="java"+s2;

        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3==s6);
        System.out.println(s5==s6);
    }

    @Test
    public void test4(){
        String s1="hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.isEmpty());
        s1="";
        System.out.println(s1.isEmpty());
        s1="java";
        String s2 = s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s1);
        String s3=s2.toLowerCase();
        System.out.println(s3);
        System.out.println(s2);

        String s4="  hh xx ";
        System.out.println(s4);
        String s5=s4.trim();
        System.out.println(s5);
        System.out.println(s4);
    }

    @Test
    public void test5(){
        String s1="hello";
        String s2="HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3="abc";
        String s4=s3.concat("def");
        System.out.println(s4);

        String s5="abc";
        String s6=new String("abe");
        System.out.println(s5.compareTo(s6));

        String s7="新世界的大船";
        String s8=s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = s7.substring(0, 3);
        System.out.println(s9);
    }

    @Test
    public void test6(){
        String s1="hello";
        boolean b1=s1.endsWith("o");
        System.out.println(b1);

        boolean b2 = s1.startsWith("h");
        System.out.println(b2);

        boolean b3=s1.startsWith("he",0);
        System.out.println(b3);


        String s2="ll";
        System.out.println(s1.contains(s2));

        System.out.println(s1.indexOf("el"));

        System.out.println(s1.indexOf("el",1));

        System.out.println(s1.lastIndexOf("el"));

        System.out.println(s1.lastIndexOf("el",4));
    }

    @Test
    public void test7(){
        String s1="空间之王空间";
        String s2 = s1.replace("空", "时");
        System.out.println(s1);
        System.out.println(s2);

        String s3="123abc4578";
        //通过正则表达式对字符串进行替换
        //此例表示去除字符串中的数字
        String s4=s3.replaceAll("\\d+","");
        System.out.println(s4);

        String s5="110";
        //通过正则表达式对字符串进行判断
        //此例中表示该字符串全部由数字组成
        boolean matches=s5.matches("\\d+");
        System.out.println(matches);

        String s6="hello,world";
        //通过正则表达式将字符串拆分成多个子串
        //此例中表示通过','进行分割
        String[] strs=s6.split(",");
        for (int i = 0; i <strs.length ; i++) {
            System.out.println(strs[i]);
        }
    }

    //String与基本数据类型，包装类之间的转换
    @Test
    public void test8(){
        String s1="123";
        int num = Integer.parseInt(s1);
        System.out.println(num);

        String s2 = String.valueOf(num);
        System.out.println(s2);

    }

    //String与char[]之间的转换
    @Test
    public void test9(){
        String s1="abc123";
        char[] chars = s1.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }

        char[] arr=new char[]{'h','e','a'};
        String s2=new String(arr);
        System.out.println(s2);
    }

    //String与byte[]之间的转换
    @Test
    public void  test10() throws UnsupportedEncodingException {
        String s1="abc123中国";
        //使用默认的编码集
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));

        //使用指定编码集
        byte[] gbks = s1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        //编码和解码使用的编码集必须一致，否则会乱码
        String s2 = new String(bytes);
        System.out.println(s2);

        //使用指定编码集进行解码
        String s3 = new String(gbks, "gbk");
        System.out.println(s3);
    }

    @Test
    public void test11(){
        StringBuffer s1=new StringBuffer("abc");
        s1.setCharAt(0,'m');
        System.out.println(s1);
    }

    @Test
    public void test12(){
        StringBuffer s1=new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);
        s1.delete(0,1);
        System.out.println(s1);

        s1.replace(0,2,"he");
        System.out.println(s1);

        s1.insert(2,22);
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        String s2 = s1.substring(1, 3);
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test13(){
        long startTime=0L;
        long endTime=0L;
        String text="";
        StringBuffer buffer=new StringBuffer("");
        StringBuilder builder=new StringBuilder("");
        startTime=System.currentTimeMillis();
        for (int i = 0; i <40000 ; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间"+(endTime-startTime));

        startTime=System.currentTimeMillis();
        for (int i = 0; i <40000 ; i++) {
            builder.append(String.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间"+(endTime-startTime));

        startTime=System.currentTimeMillis();
        for (int i = 0; i <40000 ; i++) {
            text+=i;
        }
        endTime=System.currentTimeMillis();
        System.out.println("String的执行时间"+(endTime-startTime));

    }
}
