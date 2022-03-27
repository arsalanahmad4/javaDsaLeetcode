package com.arsalan.leetcode;


import java.util.Scanner;

public class ClassArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        System.out.println(classA("GGGGBBBGBBGGB"));

    }
    static int classA(String str){
        int no_of_ones =0,no_of_zeros=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='B')
                no_of_ones++;
            else
                no_of_zeros++;
        }
        if(no_of_ones>no_of_zeros+1 || no_of_zeros>no_of_ones+1)
            return -1;
        int n;
        if(str.length()%2==1){
            n=(str.length()+1)/2;
            int no_of_even_ones=0,no_of_even_zeros=0;
            for(int i =0;i<str.length();i++){
                if(i%2==0){
                    if(str.charAt(i)=='B')
                        no_of_even_ones++;
                    else
                        no_of_even_zeros++;
                }
            }
            if(no_of_ones>no_of_zeros)
                return(n-no_of_even_ones);
            else
                return(n-no_of_even_zeros);
        }
        else{
            int no_of_odd_ones=0,no_of_even_ones=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='B'){
                    if(i%2==1)
                        no_of_odd_ones++;
                    else
                        no_of_even_ones++;
                }
            }
            return Math.min(str.length()/2-no_of_odd_ones,str.length()/2-no_of_even_ones);
        }
    }

}
