package com.arsalan.recursion;

public class Fibo {
    public static void main(String[] args) {
        for(int i =0; i<50;i++){
            int ans =fiboFormula(i);
            System.out.println(ans);
        }

    }
    static int fiboFormula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)- Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }


    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
