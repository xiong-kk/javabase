package com.free.java;

/**
 * @author free
 * @create 2023-01-06-20:44
 */
public class NewInstanceTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class class1=Person.class;

        /*newInstance调用此方法创建对应的运行时类的对象。内部调用了运行时类的空参构造器
        * 运行时类必须提供空参构造器
        * 空参构造器的访问权限不能限制访问。通常设置为public
        *
        * */
        Person obj = (Person) class1.newInstance();
        System.out.println(obj);

    }
}
