package com.arsalan;

import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    //fun(2,3,4,5,6,7);
    multiple(2,5,"apple","ball","cat");
  }
  static void multiple(int a ,int b, String ...c){
    System.out.println(a +" "+ b + " "+Arrays.toString(c));
  }
  static void fun(int... v) {
    System.out.println(Arrays.toString(v)) ;
  }
}

