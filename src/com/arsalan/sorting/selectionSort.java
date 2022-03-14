package com.arsalan.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] insertionSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
    static int[] cyclicSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i] != i+1){
                swap(arr,i,arr[i]-1);
            }
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int end = arr.length-i-1;
            int max = findMaxIndex(arr,0,end);
            swap(arr,max,end);
        }
        return arr;
    }

    static int findMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr, int max , int end){
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }
}
