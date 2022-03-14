package com.arsalan.search.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,19,23,45};
        System.out.print(search(arr,12));
    }

    static int search(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        //return the index of element
        //return -1 if element not found
        while(start <= end){
            //might be possible that start+end exceeds the range of integer so writing the formula like this
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}


