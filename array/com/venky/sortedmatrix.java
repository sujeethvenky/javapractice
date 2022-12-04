package com.venky;

import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,7)));

    }

    static int[] search(int[][] matrix,int target)
    {
        int row = matrix.length;   ///maximum length of the row;
        int col = matrix[0].length; ///maximum length of the column;
        if(col == 0)
        {
            return new int[]{-1,-1};
        }
        if(row == 1)
        {
            return binarysearch(matrix,target,0,0,col-1);
        }
        //there will be 4 parts for sorting in the row ;
        int rstart =0;
        int rend = row-1;
        int cmid = col/2;
        while(rstart < (rend-1 ))
        {
            int mid = rstart+(rend-rstart)/2;
            if(matrix[mid][cmid] == target){
                return new int[] {mid,cmid};
            }
            if(matrix[mid][cmid] < target){
                rstart = mid;
            }
            else{
                rend = mid;
            }
        }
        if(matrix[rstart][cmid] == target)
        {
            return new int[] {rstart,cmid};
        }
        if(matrix[rstart+1][cmid] == target){
            return new int[] {rstart+1,cmid};
        }
        if(target <= matrix[rstart][cmid-1]){
            return binarysearch(matrix,target,rstart,0,cmid-1);
        }
        if(target >= matrix[rstart][cmid+1] && target <= matrix[rstart][col-1] ){
            return binarysearch(matrix,target,rstart,cmid+1,col-1);
        }
        if(target <= matrix[rstart+1][cmid-1]  ){
            return binarysearch(matrix,target,rstart+1,0,cmid-1);
        }
        else{
            return binarysearch(matrix,target,rstart+1,cmid+1,col-1);
        }
    }
    static int[] binarysearch(int[][] matrix, int target, int row, int cstart, int cend)
    {
        while(cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid] < target){
             cstart = mid + 1;
            }
           else {
                cend  = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
}
