package com.arsalan.search.binarySearch;

public class practice {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,19,23,45};
        System.out.println(bs(arr,19));
    }
    static int bs(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start +(end-start)/2;
        while(arr[mid] != target){
            if(target>arr[mid]){
                start = mid;
            }if(target<arr[mid]){
                end = mid;
            }

        }
        if(arr[mid] == target){
            return mid;
        }
        else{
            return -1;
        }

    }
}
