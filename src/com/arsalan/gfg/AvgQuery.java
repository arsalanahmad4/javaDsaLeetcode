package com.arsalan.gfg;

public class AvgQuery {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] queries ={0, 2, 1, 3, 0, 4};
        int q =3;
        int n = arr.length;
        for(int i=0; i<queries.length ;i=i+2){
            int sum =0;
            int count=0;
            int l =i;
            int r = i+1;
            for (int j = l; j <= r; j++) {
                sum += arr[j];
                count++;
            }
            int mean = (int)Math.floor(sum / count);
            System.out.println(mean);
            sum = 0;
            count=0;
        }
    }

}

