package com.arsalan.search.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,3,4};
        System.out.println(search(arr,7));
    }

    static int search(int[] arr,int target){
        int b = rotatedIndex(arr);
        int ans = OrderAgnosticBS(arr,target,0,b);
        if(ans== -1){
            ans = OrderAgnosticBS(arr,target,b+1, arr.length-1);
        }
        return ans;
    }
    static int OrderAgnosticBS(int[] arr , int target,int start ,int end){
//        int start = 0;
//        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }else{
                if(arr[mid] > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
    static int rotatedIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid-1]){
                return mid;
            }else if(nums[mid]>nums[start]){
                start = mid+1;
            }else if(nums[mid]<nums[start]){
                end = mid-1;
            }
        }
        return -1;
    }
}
