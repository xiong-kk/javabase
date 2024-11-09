package com.free.java;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

    @Test
    public void test() throws Exception {
        Class clazz=Person.class;
        Constructor constructor = clazz.getConstructor(int.class, String.class);

        Object obj = constructor.newInstance(12, "TOM");
        System.out.println(obj.toString());

        Field age = clazz.getDeclaredField("age");
        age.set(obj,10);

        System.out.println(obj.toString());

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(obj);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"RICK");
        System.out.println(obj);
    }

    @Test
    public void test1(){
        Class c1=Object.class;

        Class c2 = Comparable.class;

        Class c3 = String[].class;

        Class c4=int[][].class;
        Class c5= ElementType.class;
        Class c6=Override.class;
        Class c7=int.class;
        Class c8=void.class;
        Class c9=Class.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
       


    }
}

