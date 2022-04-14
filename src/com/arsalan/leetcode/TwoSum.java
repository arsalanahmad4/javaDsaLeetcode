package com.arsalan.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] ans = {-1,-1};

        while(start<end){
            int mid = start + (end - start)/2;
            if(numbers[start]+numbers[mid] == target){
                ans[0] = start+1;
                ans[1]= mid+1;
                break;
            }else if(numbers[start]+numbers[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
