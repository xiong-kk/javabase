package com.free.java;

import java.util.Arrays;

/**
 * @author free
 * @create 2023-08-09-11:48
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{4,3,2,1};
        boolean isEquals= Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1,0);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        System.out.println(Arrays.binarySearch(arr2,2));
    }
}
