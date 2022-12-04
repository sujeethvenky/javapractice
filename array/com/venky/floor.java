package com.venky;

public class floor {
    public static void main(String [] args)
    {
        int[] arr ={2,3,4,5,6,7,8};
        int target= 1;
        int ans = binary(arr,target);
        System.out.println("found at index:-"+ans);
    }
    static int binary(int[] arr ,int target)
    {
        if(target < arr[0]){
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
        return end;
    }
}
