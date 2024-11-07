package com.free.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author free
 * @create 2024-11-07-14:32
 * 迭代器Iterator的使用
 */
public class IteratorTest {
    @Test
    public void test(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    //迭代器中的remove方法可用于删除集合中的元素
    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(12.3f);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            if("tom".equals(obj)){
                iterator.remove();
            }
        }

        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
