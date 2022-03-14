package com.arsalan.arrays;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,8,12};
        swap(arr,2,2);
        rev(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void rev(int [] arr){
        int len = arr.length;
        for(int i = 0;i<arr.length/2;i++){
            swap(arr,i,arr.length-1-i);
        }

    }
    static void swap(int[] arr,int index1 ,int index2){
        int temp = arr[index1] ;
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

