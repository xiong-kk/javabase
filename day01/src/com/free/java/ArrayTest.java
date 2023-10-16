package com.free.java;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ids=new int[10];
        ids[0]=2;
        int[] ids2=new int[]{1,2,3,4};
        System.out.println(ids2[0]);
        System.out.println(ids[0]);
        //获取数组的长度
        System.out.println(ids.length);
        //遍历数组
        for (int i = 0; i <ids2.length ; i++) {
            System.out.println(ids2[i]);
        }
    }
}
