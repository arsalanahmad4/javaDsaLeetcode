package com.arsalan.search;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Arsalan";
        char target ='a';
        System.out.println(SearchChar(name,target));
    }
    static boolean SearchChar(String str, char target ) {
        boolean result = false;
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
