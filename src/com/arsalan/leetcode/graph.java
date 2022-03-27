package com.arsalan.leetcode;

import java.util.*;

public class graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        Vector<Integer> wt = new Vector<>();
        Vector<Vector<Integer>> edge = new Vector<>();
        Map<Integer,Integer> mp = new HashMap<>() ;
        int ans =0;
        n = sc.nextInt();
        m=sc.nextInt();
        for(int i=0; i<m; i++)
        {
            int s,d;
            s= sc.nextInt();
            d = sc.nextInt();
            Vector<Integer> v = new Vector<>();

            v.add(s);
            v.add(d);
            mp.put(s,d);
            s++;
            d++;
            edge.add(v);
        }
        for(int i=0; i<n; i++)
        {
            int w;
            w = sc.nextInt();
            wt.add(w);
            Collections.sort(wt);
            int e=n-1;

            Map<Integer,Integer> val;
            while(mp.size()!=0){
                int Max_freq=Integer.MIN_VALUE;
                int Max_freq_ele;
            }
        }


    }
}
