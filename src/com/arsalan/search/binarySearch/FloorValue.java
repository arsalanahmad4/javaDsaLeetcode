package com.arsalan.search.binarySearch;

public class FloorValue {
    public static void main(String[] args) {
//        int[] arr = {-12,-5,0,6,8,23,35,49,53};
//        System.out.println(findF(arr,43));
        char[] letters = {'b','c','f'};
        System.out.println(nextGreatestLetter(letters,'f'));
    }
    static int findF(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        //if there is no number greater than target number than return -1
        if(target>arr[end]){
            return -1;
        }
        while(end>=start){
            int mid = start + (end-start)/2;
            if (arr[mid] > target) {
                end=mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        if(target>=letters[end]){
            return letters[0];
        }
        while(end>=start){
            int mid = start + (end-start)/2;
            if (letters[mid] > target) {
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start];
    }
}
