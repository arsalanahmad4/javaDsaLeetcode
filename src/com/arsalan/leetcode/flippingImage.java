package com.arsalan.leetcode;

import java.util.Arrays;

public class flippingImage {


    public static void main(String[] args) {
        int[][] arr ={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int n = 3;
        int[][] flipped = new int[n][n];

        for(int i =0;i<n;i++){
            int[] temp = new int[image[i].length];
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
                for(int k =image[i].length-1;k>0;k--){
                    temp[k]=image[i][j];
                }
            }
            flipped[i] = temp;

        }
        return flipped;
    }
}
