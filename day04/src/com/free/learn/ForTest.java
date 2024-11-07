package com.free.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author free
 * @create 2024-11-07-14:44
 * 增强for循环foreach
 */
public class ForTest {

    @Test
    public void test(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        for (Object obj:coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void test1(){
        int[] num=new int[]{1,2,3};
        for (int n:num) {
            System.out.println(n);
        }
    }
}
