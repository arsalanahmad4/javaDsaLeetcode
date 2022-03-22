package com.arsalan.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        System.out.println("Arsalan"+new ArrayList<>());
        //noinspection removal
        System.out.println("Arsalan"+new Integer(53));

    }
}
