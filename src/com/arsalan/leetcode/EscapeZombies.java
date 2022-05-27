package com.arsalan.leetcode;



import java.util.*;

public class EscapeZombies {
    public static void main(String[] args) {
        int rowSize,columnSize;
        Scanner sc = new Scanner(System.in);
        rowSize= sc.nextInt();
        columnSize= sc.nextInt();

        Vector<Vector<Integer>> grid = new Vector<Vector<Integer>>(rowSize);
        grid.add(new Vector<>(columnSize));
        System.out.println(takeInput(grid,rowSize,columnSize));
    }
    static int solveFunction(int rows, int columns, int rowSize, int columnSize,Vector<Vector<Integer>> grid, Vector<Vector<Integer>> dp){
        int[] directionx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] directiony = {-1, 0, 1, 1, 1, 0, -1, -1};
        PriorityQueue<ArrayList<Integer>> priority = new PriorityQueue<>();
        ArrayList<Integer> inp = new ArrayList<Integer>();
        inp.add(0);
        inp.add(rows*rowSize + columns);
        priority.add(inp);
        int result = Integer.MAX_VALUE;
        while(!(priority.isEmpty())){
            ArrayList var = (ArrayList) priority.peek();
            priority.poll();
            for(int i=0; i<8; i++){
                int newRow = (int)var.get(1) / rowSize + directionx[i], newColumn = (int)(var.get(1))%rowSize + directiony[i];
                if(newRow>=0 && newRow<rowSize && newColumn>=0 && newColumn<columnSize){
                    if(dp.get(newRow).get(newColumn) > (int)var.get(0) + (grid.get(newRow).get(newColumn))){
                        dp.get(newRow).setElementAt(newColumn,(int)var.get(0) + grid.get(newRow).get(newColumn));
                        ArrayList<Integer> inp1 = new ArrayList<Integer>();
                        inp1.add(dp.get(newRow).get(newColumn));
                        inp1.add(newRow*rowSize + newColumn);
                        priority.add(inp1);
                    }
                }else{
                    result = Math.min(result, (int)var.get(0));
                }
            }
        }
        return result;
    }

    static int takeInput(Vector<Vector<Integer>> grid, int rowSize, int columnSize){
        Vector<Vector<Integer>> dp = new Vector<Vector<Integer>>(rowSize);
        dp.add(new Vector<>(columnSize,Integer.MAX_VALUE));
        ArrayList<Integer> inp = new ArrayList<Integer>();
        for(int i =0;i<rowSize;i++){
            for(int j =0;j<columnSize;j++){
                Scanner sc = new Scanner(System.in);
                 i = sc.nextInt();
                 j = sc.nextInt();
                 if(grid.get(i).get(j) == 0){
                     inp.add(i);
                     inp.add(j);
                 }
            }
        }
        return solveFunction(inp.get(0),inp.get(1),rowSize,columnSize,grid,dp);
    }
}

