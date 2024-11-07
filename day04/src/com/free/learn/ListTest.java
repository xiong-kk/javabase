package com.free.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author free
 * @create 2024-11-07-14:56
 */
public class ListTest {
    @Test
    public void test(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("Tom");
        System.out.println(list);

        list.add(1,"KK");
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.indexOf(456));

        System.out.println(list.lastIndexOf(456));

        System.out.println(list.remove(0));
        System.out.println(list);

        list.set(0,"CC");
        System.out.println(list);

        List list2 = list.subList(0, 3);
        System.out.println(list2);
        System.out.println(list);
    }
}
