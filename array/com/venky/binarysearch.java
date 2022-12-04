package com.venky;

public class binarysearch{
    public static void main(String [] args)
{
  int[] arr ={1,2,3,4,5,6,7,8};
  int target= 9;
  int ans = binary(arr,target);
    System.out.println("found at index:-"+ans);
}
  static int binary(int[] arr ,int target)
  {
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
           return -1;
  }
}