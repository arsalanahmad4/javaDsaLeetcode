package com.arsalan.strings;

public class Performance {
    public static void main(String[] args) {
        String s  = "";
        for(int i =0;i<26;i++){
            char ch = (char) ('a'+i);

            s= s+ch;
        }
        System.out.println(s);
    }
}
