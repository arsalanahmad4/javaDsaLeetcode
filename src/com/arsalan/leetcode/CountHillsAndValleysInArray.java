package com.arsalan.leetcode;

public class CountHillsAndValleysInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,1,1,6,5};
        int[] arr1 = {6,6,5,5,4,1};
        int[] arr2 = {5,7,7,1,1,7};
        System.out.println(countHillAndValley(arr2));
    }

    public static int countHillValley(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
            for(int j=i-1;j<nums.length-2;j++){
                if(nums[i]>nums[j] && nums[i]>nums[j+2]){
                    ans+=1;
                    break;
                }
                if(nums[i]==nums[i+1]){
                    if(nums[i]>nums[j] && nums[i]>nums[j+3]){
                        ans+=1;
                        break;
                    }
                }
                if(nums[i]<nums[j] && nums[i]<nums[j+2]){
                    ans+=1;
                    break;
                }
                if(nums[i]==nums[i+1]){
                    if(nums[i]<nums[j] && nums[i]<nums[j+3]){
                        ans+=1;
                        break;
                    }
                }
                break;
            }
        }
        return ans;
    }
    static int countHillAndValley(int[] nums){
        int r=0;
        int left = nums[0];
        for(int i =1;i<nums.length-1;i++){
            if(nums[i]>left && nums[i]>nums[i+1] || nums[i]<left && nums[i]<nums[i+1]){
                r+=1;
                left = nums[i];
            }
        }
        return r;
    }

}

