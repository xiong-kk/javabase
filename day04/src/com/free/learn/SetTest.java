package com.free.learn;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author free
 * @create 2024-11-07-15:08
 */
public class SetTest {
    @Test
    public void test(){
        Set set=new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add(123);
        System.out.println(set);
    }

    @Test
    public void test1(){
        Set set=new LinkedHashSet();
        set.add(123);
        set.add("AA");
        set.add(123.5f);
        System.out.println(set);
    }

    @Test
    public void test2(){
        TreeSet set=new TreeSet();
        set.add(123);
        set.add(456);
        set.add(111);
        System.out.println(set);
    }
}
