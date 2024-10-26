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
}