package com.arsalan.search.twoDBinarySearch;

import java.util.Arrays;

public class StrictlyOrderedBS {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };

        System.out.println(Arrays.toString(search(arr,16)));

    }

    //search in the row provided
    static int[] binarySearch(int[][] matrix , int row, int cStart, int cEnd , int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2 ;
            if(matrix[row][mid] >target){
                cEnd = mid-1;
            }else if(matrix[row][mid]<target){
                cStart = mid+1;
            }else{
                return new int[]{row,mid};
            }

        }
        return new int[]{-1,-1};
    }

    /**
     * We will start by dividing the matrix until we remain with two rows and we find the target in that two rows
     * in that two rows first we divide two rows by the mid col and first check for target in th mid col
     * if target not found then we divide the remaining elements in 4 parts, 1 part would be in first row before the mid col
     * 2nd would be after the midCol after mid and same would be for second row
     */

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;//be cautious, matrix may be empty

        //if there is only one row we wont be able to find two rows
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        //applying the concept of binary search for rows and eliminating the rows less than or greater than target for taking element in the mid col
        int rowStart = 0;
        int rowEnd = rows-1;

        int colMid = cols/2;

        //the while condition will get violated when there is only two rows left for search
        while(rowStart < (rowEnd-1)){
            int mid = rowStart + (rowEnd-rowStart)/2;

            if(matrix[mid][colMid] ==target){
                return new int[]{mid,colMid};
            }
            if(matrix[mid][colMid]>target){
                //not mid+1 bcoz we have not checked the elements in the row
                rowEnd = mid;
            }else {
                rowStart = mid;
            }
        }

        //checking for target in the mid col of remaining two rows
        if(matrix[rowStart][colMid] == target){
            return new int[]{rowStart,colMid};
        }
        //rowEnd == rowStart+1 bcoz only two rows left
        if(matrix[rowStart+1][colMid] == target){
            return new int[]{rowStart+1,colMid};
        }

        //checking elements in the 4 left parts
        if(target <= matrix[rowStart][colMid-1]){
            return binarySearch(matrix,rowStart,0,colMid-1,target);
        }
        if(target >= matrix[rowStart][colMid+1]  && target <= matrix[rowStart][cols-1]){
            return binarySearch(matrix,rowStart,colMid+1,cols-1,target);
        }
        if(target <= matrix[rowStart+1][colMid-1]){
            return binarySearch(matrix,rowStart+1,0,colMid-1,target);
        }
        if(target >= matrix[rowStart+1][colMid+1] && target <= matrix[rowStart+1][cols-1]){
            return binarySearch(matrix,rowStart+1,colMid+1,cols-1,target);
        }

      return new int[]{-1,-1};

    }

}
