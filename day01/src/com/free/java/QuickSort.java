package com.free.java;

import java.util.Arrays;

/**
 * 快速排序：通过一趟排序将要排序的数据分割成独立的两个部分，
 * 其中一个部分的所有数据都比另外一部分小，然后再按此方法分别进行快速排序，整个排序过程可以递归进行。
 *
 * 选择一个中间值。从两端开始比较。左侧数据要求比中间值小，右侧数据要求比中间值大。左侧数据符合要求时，
 * 向右移动一个位置，不符合要求时停。右侧数据符合要求时向左侧移动一个位置，不符合时和左侧数据交换。
 * 当左侧位置出现在右侧位置右边时，算法停止。
 */
public class QuickSort {
    public static void quicksort(int arr[],int left,int right){
        //左侧位置
        int l=left;
        //右侧位置
        int r=right;
        //中间值
        int pivot=arr[(left+right)/2];
        int temp=0;
        while (l<r){
            while (arr[l]<pivot){
                l+=1;
            }
            while (arr[r]>pivot){
                r-=1;
            }
            if(l>=r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if(arr[l]==pivot){
                r--;
            }
            if(arr[r]==pivot){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }
        if(left<r){
            quicksort(arr,left,r);
        }
        if(right>l){
            quicksort(arr,l,right);
        }
    }
    public static void main(String[] args){
        int[] arr={-9,78,0,23,-567,70};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
