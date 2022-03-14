package com.arsalan.search.binarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,10};
        int target = 8;
        int[] a = searchRange(nums,target);
        System.out.println(a[0]+" "+a[1]);
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = possibleAns(nums,target,true);
        ans[1] = possibleAns(nums,target,false);

        return ans;
    }

    public static int possibleAns(int[] nums , int target , boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]< target){
                start = mid +1;
            }else{
                ans = mid;
                if(startIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
