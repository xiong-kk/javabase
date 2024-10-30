package com.free.learn;

/**
 * @author free
 * @create 2024-10-29-22:06
 */
public class Student extends Person{
    String major;

    public Student(){

    }
    public Student(String name,int age,String major){
        this.name=name;
        setAge(age);
        this.major=major;
    }


    public void study(){
        System.out.println("学习");
    }

    //子类重写父类中已有的方法
    public void eat(){
        System.out.println("吃有营养的食物");
    }

}
