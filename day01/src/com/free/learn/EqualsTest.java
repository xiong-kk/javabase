package com.free.learn;

/**
 * @author free
 * @create 2024-10-31-15:20
 *
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i=10;
        int j=10;
        double d=10.0;
        System.out.println(i==j);
        System.out.println(i==d);

        char c=10;
        System.out.println(i==c);

        String s1=new String("a");
        String s2=new String("a");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
