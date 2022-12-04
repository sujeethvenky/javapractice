package com.venky;

import java.util.Arrays;
import java.util.Scanner;

public class twodimension{
    public static void main(String[]  arg)
    {
        Scanner sc =new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = sc.nextInt();
        int[] ans = linearsearch(arr,target);
        int answer = max(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println("maximu value:-"+answer);
    }
    static int[] linearsearch(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max)
                    max = anInt;
            }
        }
        return max;
    }

}
