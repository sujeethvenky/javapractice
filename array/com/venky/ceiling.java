package com.venky;

public class ceiling {
    public static void main(String [] args)
    {
        int[] arr ={2,4,6,8,10,12,14};
        int target= 15;
        int ans = binary(arr,target);
        System.out.println("ans:"+ans);
    }
    static int binary(int[] arr ,int target)
    {
        if(target > arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start<=end)
        {
            int mid = start+(end-start)/2;

            if ( target < arr[mid]) {
                end=mid-1;
            }
            else if(target > arr[mid]){

                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
