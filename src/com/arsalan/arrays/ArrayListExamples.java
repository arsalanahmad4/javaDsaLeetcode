package com.arsalan.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(23);
//        list.add(96);
//        list.add(54);
//        list.add(197);
//        System.out.print(list);
        for(int i =0; i<5 ; i++){
            list.add(i,sc.nextInt());
        }
        System.out.print(list);
    }
}
