package com.arsalan.search.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7,9,22,36,45,96,102,231,235,245,276};
        System.out.println(ans(a,36));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //Box size initially is 2
        int start =0;
        int end = 1;
        //Check if target lies within the box by checking end is greater than target or not
        while(target>arr[end]){
            int temp = end +1;
            //double the box value
            //end = end+ (boxLength)*2
            end = end+(end-start+1)*2;
            start = temp;
        }

            return search(arr,target,start,end);

    }
    static int search(int[] arr, int target,int start,int end){
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
