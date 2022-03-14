package com.arsalan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.print("Entered choice is 1");
            case 2 -> System.out.print("Entered choice is 2");
            case 3,4 -> System.out.print("Entered choice is 3");
            default -> System.out.println("Option not available");
        }
    }
}
