package com.free.learn;

/**
 * @author free
 * @create 2024-10-31-0:26
 * 多态性的使用
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test=new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shout(){
        System.out.println("喵喵喵");
    }
}