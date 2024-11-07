package com.free.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author free
 * @create 2024-11-07-16:31
 */
public class CollectionsTest {
    @Test
    public void test(){
        List list=new ArrayList();
        list.add(123);
        list.add(987);
        list.add(-123);
        list.add(42);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.swap(list,0,1);
        System.out.println(list);

        System.out.println(Collections.frequency(list,42));

        List list1=new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add("DD");
        list1.add("KK");
        list1.add("ZZ");
        Collections.copy(list1,list);
        System.out.println(list1);
    }
}
