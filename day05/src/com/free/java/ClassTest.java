package com.free.java;

/**
 * @author free
 * @create 2023-01-06-16:54
 */
public class ClassTest {
    //获取Class的实例
    public static void main(String[] args) throws ClassNotFoundException {
        //直接调用运行时类的属性
        Class class1=Person.class;
        System.out.println(class1);

        //通过运行时类的对象，调用getClass()方法
        Person p1=new Person();
        Class class2=p1.getClass();
        System.out.println(class2);

        //调用Class的静态方法，forName(),需要指定全限定类名
        Class class3=Class.forName("com.free.java.Person");
        System.out.println(class3);

        //使用类的加载器：ClassLoader
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        Class class4 = classLoader.loadClass("com.free.java.Person");
        System.out.println(class4);

        System.out.println(class1==class2);
        System.out.println(class2==class3);
        System.out.println(class3==class4);


    }
}

