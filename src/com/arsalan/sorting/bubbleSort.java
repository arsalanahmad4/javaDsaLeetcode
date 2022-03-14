package com.arsalan.sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] a ={1,2,2,5,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr){
        boolean swapped;
        for(int i =0;i< arr.length;i++){
            swapped = false;
            for(int j = 1 ; j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

