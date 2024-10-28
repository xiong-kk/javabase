package com.free.java;

/**
 * @author free
 * @create 2024-10-28-12:10
 * 方法的值传递
 */
public class ValueTransfer {
    public static void main(String[] args) {
        //基本数据类型，传递的是数据值，其中一个改变，另一个不会改变
        int m=10;
        int n=m;
        System.out.println("m="+m+",n="+n);
        n=20;
        System.out.println("m="+m+",n="+n);

        //引用数据类型，传递的是地址值，其中一个改变，另一个也会改变
        OrderT o1=new OrderT();
        o1.orderId=1001;

        OrderT o2=o1;
        System.out.println("o1.orderId="+o1.orderId+",o2.orderId="+o2.orderId);
        o2.orderId=1002;
        System.out.println("o1.orderId="+o1.orderId+",o2.orderId="+o2.orderId);


        ValueTransfer v=new ValueTransfer();
        v.test();

    }
    public void test(){
        OrderT o1=new OrderT();
        o1.orderId=10;
        test1(o1);
        System.out.println(o1.orderId);
    }
    public void test1(OrderT o){
        OrderT o2=new OrderT();
        o2.orderId=20;
        o=o2;
        System.out.println(o.orderId);
    }
}
class OrderT{
    int orderId;
}
