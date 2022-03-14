package com.arsalan;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(isArmstrong(n));
        for(int i =100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }
        if(sum == original) {
            return true;
        }else{
            return false;
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
