package com.free.java;

/**
 * @author free
 * @create 2024-10-29-17:16
 * 构造器相关练习
 */
public class ConstructTest {
    public static void main(String[] args) {

        Person1 p=new Person1();
        p.eat();
        Person1 p1=new Person1("Rick");
        System.out.println(p1.name);
    }
}
class Person1{
    String name;
    int age;

    public Person1(){
        System.out.println("我是构造器");
    }

    //构造器之间可以构成重载
    public Person1(String n){
        name=n;
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }
}
