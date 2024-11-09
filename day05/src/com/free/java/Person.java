package com.free.java;

/**
 * @author free
 * @create 2023-01-06-20:44
 */
public class Person{
    public int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("你好，我是一个人");
    }
    private String showNation(String nation){
        System.out.println("我的国籍是"+nation);
        return nation;
    }
}
