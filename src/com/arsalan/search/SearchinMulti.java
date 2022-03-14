package com.arsalan.search;

public class SearchinMulti {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,5,7,1},
                {5,4,9,2},
                {1,6,0},
                {9,1,5}
        };
        int target = 5;
        SearchIn(arr,target);
    }
    static void SearchIn(int[][] arr,int target){
        for(int i =0; i<arr.length;i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.print("[" + i + "]" + "[" + j + "] ");
                }
            }
    }
}
