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

        Person p2=new Person();
        p2.eat();

        Man m1=new Man();
        m1.eat();
        m1.earn();


        Person p3=new Man();
        p3.eat();

        //向下转型。需要先进行判断
        if(p3 instanceof Man){
            Man m2=(Man)p3;
            m2.earn();
            System.out.println("man");
        }

    }
}
