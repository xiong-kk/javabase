package com.free.learn;

import org.junit.Test;

import java.util.*;

/**
 * @author free
 * @create 2024-11-07-15:52
 */
public class MapTest {
    @Test
    public void test(){
        Map map=new HashMap();
        map.put(null,null);
        System.out.println(map);

        map=new Hashtable();
        map.put(null,null);
        System.out.println(map);
    }

    @Test
    public void test1(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put("KK",125);
        map.put("AA",127);
        System.out.println(map);


        Map map1=new HashMap();
        map1.putAll(map);
        System.out.println(map1);

        Object aa = map.remove("AA");
        System.out.println(aa);
        System.out.println(map);

        map.clear();
        System.out.println(map);
        System.out.println(map.size());
    }

    @Test
    public void test2(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put("KK",125);
        map.put("AA",127);

        System.out.println(map.get("AA"));

        System.out.println(map.containsKey("AA"));
        System.out.println(map.containsValue("123"));

        System.out.println(map.size());

        map.clear();
        System.out.println(map.isEmpty());
    }

    //遍历map
    @Test
    public void test3(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put("KK",125);
        map.put("AA",127);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection values = map.values();
        for (Object obj:values) {
            System.out.println(obj);
        }

        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }

    @Test
    public void test4(){
        TreeMap map=new TreeMap();
        map.put("AA",1234);
        map.put("KK",345);
        System.out.println(map);
    }
}
