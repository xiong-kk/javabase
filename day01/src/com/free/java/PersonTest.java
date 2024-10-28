package com.free.java;

/**
 * @author free
 * @create 2024-10-26-21:14
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.eat();
        person.sleep();
        person.talk("中文");
        person.skill("java","c","c++");
    }
}
class Person{
    String name;
    int age=1;
    boolean isMale;

    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
    public void talk(String language){
        System.out.println("人说话，语言是"+language);
    }
    //可变个数的形参
    public void skill(String ... skills){
        for (int i = 0; i < skills.length; i++) {
            System.out.println(skills[i]);
        }

    }
}