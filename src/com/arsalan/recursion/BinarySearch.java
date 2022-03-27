package com.arsalan.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,12,13,17};
        System.out.println(binarySearch(arr,77,0,arr.length-1));
    }
    static int binarySearch(int[] arr ,int target, int start,int end ){
        int mid = start + (end - start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]== target){
            return mid;
        }else if(arr[mid]>target){
            return binarySearch(arr,target,start, mid-1);
        }
            return binarySearch(arr,target,mid+1,end);


    }
}
