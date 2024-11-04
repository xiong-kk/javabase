package com.free.learn;

/**
 * @author free
 * @create 2024-11-04-20:36
 * 接口
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        Plane p=new Plane();
        p.fly();
        p.stop();
        p.method2();

        Bullet b=new Bullet();
    }
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED=7900;
    public static final int MIN_SPEED=1;

    //抽象方法
    public abstract void fly();
    public abstract void stop();

    //静态方法
    public static void method1(){
        System.out.println("静态方法");
    }

    //默认方法
    public default void method2(){
        System.out.println("默认方法");
    }

}

interface Attackable{
    void attack();
}

//实现接口
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("飞行员减速停止");
    }
}

//类可以实现多个接口
class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
