package com.free.java;

/**
 * Object类是所有类的根父类
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order=new Order();
        //获取父类
        System.out.println(order.getClass().getSuperclass());
    }
}
class Order{

}
