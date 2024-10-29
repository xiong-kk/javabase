package com.free.learn;

/**
 * @author free
 * @create 2024-10-29-22:09
 * 继承相关练习
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(1);
        p1.eat();

        Student s1=new Student();
        s1.eat();
        s1.sleep();
        s1.name="Rick";
        s1.setAge(10);
        System.out.println(s1.getAge());

    }
}
