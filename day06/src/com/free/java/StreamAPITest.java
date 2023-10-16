package com.free.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author free
 * @create 2023-01-07-16:18
 */
public class StreamAPITest {
    @Test
    public void test1(){

        List list= Arrays.asList("a,b,c");
        Stream stream= list.stream();

        String[] strs=new String[10];
        Stream stream1=Arrays.stream(strs);

        Stream<String> stream2 = Stream.of("a", "bc");

        Stream.iterate(0,a->a+1).limit(10).forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

    @Test
    public void test2(){
        List list= Arrays.asList(1,2,3,4,5,5);
        Stream<Integer> stream= list.stream();

        stream.filter(e->e>3).forEach(System.out::println);

        Stream<Integer> stream2= list.stream();
        stream2.distinct().forEach(System.out::println);
    }

    @Test
    public void test3(){

        List list= Arrays.asList("a","A","c");
        Stream<String> stream= list.stream();

        stream.map(t->t.toUpperCase()).forEach(System.out::println);

    }

    @Test
    public void test4(){
        List list= Arrays.asList(1,2,3,4,5,5);
        Stream<Integer> stream= list.stream();

        Optional<Integer> reduce = stream.reduce(Integer::sum);
        System.out.println(reduce);
    }

    @Test
    public void test5(){
        List list= Arrays.asList(1,2,4,3,5,5);
        Stream<Integer> stream= list.stream();
        
        Stream<Integer> stream1=list.stream();

        List<Integer> list1=stream1.sorted().collect(Collectors.toList());
        list1.forEach(System.out::println);
        Set<Integer> set = stream.collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}
