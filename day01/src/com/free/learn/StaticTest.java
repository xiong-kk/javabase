package com.free.learn;

/**
 * @author free
 * @create 2024-11-02-20:36
 */
public class StaticTest {
    public static void main(String[] args) {
        Chiness.nation="中国";
        Chiness.show();


        Chiness c1=new Chiness();
        c1.name="辉煌";
        c1.age=40;

        Chiness c2=new Chiness();
        c2.name="伟大";
        c2.age=30;

        c1.nation="CHN";
        System.out.println(c2.nation);

    }
}
class Chiness{
    String name;
    int age;
    static String nation;
    public void eat(){
        System.out.println("吃中餐");
    }

    public static void show(){
        System.out.println("中国人");
    }

}
