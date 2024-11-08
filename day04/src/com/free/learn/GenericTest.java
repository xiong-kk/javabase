package com.free.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author free
 * @create 2024-11-09-0:39
 * 泛型的使用
 */
public class GenericTest {

    @Test
    public void test(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(234);
        list.add(45);
        System.out.println(list);
    }

    //通配符
    @Test
    public void test1(){
        List<Object> list1=null;
        List<String> list2=null;

        List<?> list=null;
        list=list1;
        list=list2;




    }
}
