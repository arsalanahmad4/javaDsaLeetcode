package com.arsalan.arrays;

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = createTargetArray(nums,index);
        System.out.println(Arrays.toString(result));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        boolean[] visited = new boolean[nums.length];
        for(int i =0;i<nums.length;i++){
            if(visited[index[i]] != true){
                target[index[i]] = nums[i];
                visited[i] = true;
            }
            if(visited[index[i]] == true){
                for(int j =i;i<nums.length;j++){
                    int temp =target[i];
                    target[index[i]] = nums[i];

                }
            }
        }
        return target;
    }
}
