package com.arsalan.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> arr = new ArrayList<>(7);
        arr.add(new ArrayList<Character>(20));
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        ArrayList<Character> b = new ArrayList<>();
        b.add('a');
        b.add('b');
        arr.add(1,a);
        arr.add(2,b);
        Long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        long row_num = between(n);
        for(int i = 3 ; i <= row_num; i++){
            arr.add(i,change(arr.get(i-1)));
        }
        System.out.println(arr.get((int) row_num).get((int) (n-Math.pow(2,row_num-1))));

    }
    static ArrayList<Character> change(ArrayList<Character> arr){
        ArrayList<Character> ans = new ArrayList<>();
        for(char ch: arr){
            if(ch== 'a' || ch =='d'){
                ans.add('a');
                ans.add('b');
            }else if(ch=='c'|| ch=='b'){
                ans.add('c');
                ans.add('d');
            }
        }
        return ans;
    }
    static long between(long n){
        for(long i = 0;i<n/2+1 ; i++){
            if( n <Math.pow(2,i)){
                return i;
            }
        }
        return 0;
    }
}
