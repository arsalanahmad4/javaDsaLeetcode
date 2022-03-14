package com.arsalan;

public class PiythagorianTriplet {
    public static void main(String[] args) {
        int[] a = { 3, 1, 4, 6, 5 };
        System.out.print(checkTriplet(a));
    }
     static boolean checkTriplet(int[] a){
        boolean cond = false;
        for(int i =0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                for(int k =j+1;k<a.length;k++){
                    int x = a[i]*a[i];
                    int y = a[j]*a[j];
                    int z = a[k]*a[k];
                    if(x == y+z || y ==x+z || z==x+y) cond = true;
                }
            }
        }
        return cond;
    }
}
