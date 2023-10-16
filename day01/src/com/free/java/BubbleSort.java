package com.free.java;

/**
 * 数组的冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{22,45,-34,66,8475,534,0,-1};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
