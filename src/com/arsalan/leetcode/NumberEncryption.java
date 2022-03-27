package com.arsalan.leetcode;

import java.util.Collections;
import java.util.Scanner;

public class NumberEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strng = sc.next();
        String cmnd = sc.next();
        System.out.println(nEncryp(strng,cmnd));
    }
    static String nEncryp(String str, String cmd){
        char[] strng = str.toCharArray();
        char[] command = cmd.toCharArray();
        int index =0;
        int i;
        for( i =0;i<command.length;i++){
            switch (command[i]){
                case 'R':
                    if(index+1 < strng.length)
                        index++;
                    break;
                case 'L':
                    if(index>0)
                        index--;
                    break;
                case 'T':
                    if (strng[index] != '9')
                        strng[index]++;
                    break;
                case 'D':
                    if (strng[index] != '0')
                        strng[index]--;
                    break;
                case 'S':
                    i++;
                    StringBuilder b = new StringBuilder();
                    for (int j =i; j < (int)command.length && command[j] >= '0' && command[j] <= '9'; j++)
                        b.append(command[j]);
                    i--;
                    int ind = Integer.parseInt(String.valueOf(b));
                    char temp = strng[index];
                    strng[index]=strng[ind-1];
                    strng[ind-1]=temp;
                    break;
            }
        }

        return String.valueOf(strng);
    }

}
