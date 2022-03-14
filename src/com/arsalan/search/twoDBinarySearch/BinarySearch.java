package com.arsalan.search.twoDBinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40,50},
                {25,35,45,55,65},
                {35,37,47,59,69}};


        System.out.println(Arrays.toString(search(arr, 69)));
    }
    static int[] search(int[][] matrix, int target){
        int r=0;
        int c = matrix[r].length-1;
        while(c>0 && r<matrix.length){
            if(matrix[r][c]==target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }else if (matrix [r][c] >target){
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
