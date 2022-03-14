package com.arsalan.leetcode;

import java.util.Arrays;

public class KeyPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] ans = shuffle(arr,4);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int j =0;j<n ;j++){
            for(int i = 0 ;i<2*n;i=i+2){
                ans[i] = nums[j];
            }
        }
        for(int k=n;k<2*n;k++){
            for(int i = 1 ;i<2*n;i=i+2){
                ans[i] = nums[k];
            }
        }
        return ans;
    }
}
