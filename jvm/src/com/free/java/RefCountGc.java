package com.free.java;

/**
 * -XX:+PrintGCDetails打印gc信息，在vm的参数中添加
 * java使用的不是引用计数算法
 * @author free
 * @create 2023-06-04-9:37
 */
public class RefCountGc {
    //占用内存空间
    private byte[] bigSize=new byte[5*1024*1024];
    Object reference=null;

    public static void main(String[] args) {
        RefCountGc obj1=new RefCountGc();
        RefCountGc obj2=new RefCountGc();

        obj1.reference=obj2;
        obj2.reference=obj1;
        obj1=null;
        obj2=null;
        //显式执行垃圾回收
        System.gc();
    }
}
