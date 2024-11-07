package com.free.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author free
 * @create 2024-11-06-23:06
 */
public class CompareTest {

    @Test
    public void test(){
        String[] arr=new String[]{"AA","ZZ","DD","KK","BB"};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    //自然排序
    @Test
    public void test1(){

        Goods[] arr=new Goods[4];
        arr[0]=new Goods("新世界",24);
        arr[1]=new Goods("太阳",12);
        arr[2]=new Goods("群星",36);
        arr[3]=new Goods("黑洞",67);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //定制排序
    @Test
    public void test2(){
        String[] arr=new String[]{"AA","ZZ","DD","KK","BB"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}

class Goods implements Comparable{
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //自定义比较器
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods=(Goods)o;
            if(this.price>goods.price){
                return 1;
            }else if(this.price<goods.price){
                return -1;
            }else {
                return 0;
            }
        }
        throw new RuntimeException("传入的数据类型不正确");
    }
}
