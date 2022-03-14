package com.arsalan.search;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {22,43,54,6,44,45,554};
    System.out.println(linearS1(arr,44));
    System.out.print(linearS2(arr, 22));
    }
    static int linearS1(int[] arr ,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index =0; index<arr.length ;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    static boolean linearS2(int[] arr ,int target){
        if(arr.length == 0){
            return false;
        }
        for(int element: arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
