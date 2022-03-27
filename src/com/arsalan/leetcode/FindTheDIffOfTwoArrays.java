package com.arsalan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindTheDIffOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3};
        int[] nums2 ={2,4,6};
        System.out.println(findDifference(nums1,nums2));

    }
        static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

            List<List<Integer>> answer = new ArrayList<>();

            List<Integer> a1 = new ArrayList<>();
            for(int i=0;i< nums1.length;i++){
                boolean distinct = false;
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]-nums2[j] == 0){
                        break;
                    }else if(nums1[i] != nums2[j]){
                        a1.add(nums1[i]);
                        break;
                    }

                }

            }
            answer.add(a1);

            List<Integer> a2 = new ArrayList<>();
            for(int i =0;i<nums2.length;i++){
                for(int j =0;j<nums1.length;j++){
                    if(nums2[i]-nums1[j] ==0){
                        break;
                    }
                    else if(nums2[i] != nums1[j]){
                        a2.add(nums2[i]);
                        break;
                    }
                }
            }
            answer.add(a2);

            return answer;

        }

    }

