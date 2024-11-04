package com.free.learn;

/**
 * @author free
 * @create 2024-11-04-16:04
 * 代码块
 */
public class BlockTest {
    public static void main(String[] args) {
        Per.info();
        Per p=new Per();
    }
}
class Per{
    String name;
    int age;
    static String desc="我是一个人";

    public Per(){

    }
    public Per(String name,int age){
        this.name=name;
        this.age=age;
    }

    static {
        System.out.println("hello,static block");
    }
    {
        System.out.println("hello,block");
    }


    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Per{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("我是一个人");
    }
}
