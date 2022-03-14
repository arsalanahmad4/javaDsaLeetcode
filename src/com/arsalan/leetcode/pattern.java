package com.arsalan.leetcode;

public class pattern {
    public static void main(String[] args) {
        rightAngleTri(10);
    }

    static void square(int side){
        for(int i=0;i<side;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i =0;i<side-2;i++){

        }
        System.out.print("*");
    }

    static void pat(int n){
        int num =1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }

    static void verticalTri(int n){
        int rows = 2*n -1;
        for(int i =1;i<=rows;i++){
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else{
                for(int j =1;j<=rows-i+1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    static void rightAngleTri(int n){
        System.out.println("* ");
        for(int i =2; i<n;i++){
            System.out.print("* ");
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();

        }
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
    }
}
