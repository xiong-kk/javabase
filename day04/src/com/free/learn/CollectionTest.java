package com.free.learn;

import org.junit.Test;

import java.util.*;

/**
 * @author free
 * @create 2024-11-07-13:54
 */
public class CollectionTest {
    @Test
    public void test(){
        Collection coll=new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add(new Date());
        System.out.println(coll.size());

        Collection coll2=new ArrayList();
        coll2.addAll(coll);
        System.out.println(coll2.size());

        System.out.println(coll.isEmpty());

        coll.clear();
        System.out.println(coll.isEmpty());
    }

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);
        System.out.println(coll.contains(123));
        System.out.println(coll.containsAll(coll2));
    }

    @Test
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);

        boolean b = coll.remove(123);
        System.out.println(coll.size());

        coll.removeAll(coll2);
        System.out.println(coll);
    }

    @Test
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);

        coll.retainAll(coll2);
        System.out.println(coll);
    }

    @Test
    public void test4(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("tom"));
        coll2.add(12.3f);

        System.out.println(coll.equals(coll2));
    }

    @Test
    public void test5(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("tom"));
        coll2.add(12.3f);

        System.out.println(coll.hashCode());

        Object[] objects = coll.toArray();
        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i]);
        }


        List<String> list = Arrays.asList(new String[]{"AA", "BB"});
        System.out.println(list);
    }
}
