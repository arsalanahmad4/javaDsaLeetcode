package com.arsalan.search;

public class NoOfDigits {
    public static void main(String[] args) {
        int[] arr = {21,32,32,43,321,22222222,-12,341,060};
        System.out.print(evenDigitsNum(arr));
    }
    static int evenDigitsNum(int[] arr){
        int count =0;
        for(int i =0 ;i< arr.length ;i++){
            int temp = arr[i];
            int digits =0;
            while(temp !=0){
                temp= temp/10;
                digits++;
            }
            if(digits%2 ==0 && arr[i] != 0){
                count++;
            }
            digits = 0;
        }
        return count;
    }
}
