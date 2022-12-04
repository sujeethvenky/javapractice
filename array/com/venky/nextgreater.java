package com.venky;

public class nextgreater {
    public static void main(String [] args)
    {
        char[] arr={'c','f','j'};
        char target= 'f';
        char ans = binary(arr,target);
        System.out.println("ans:"+ans);
    }
    static char binary(char[] arr ,char target)
    {

        int start = 0;
        int end = arr.length-1;

        while (start<=end)
        {
            int mid = start+(end-start)/2;

            if ( target < arr[mid]) {
                end=mid-1;
            }
            else{

                start=mid+1;
            }

        }
        return arr[start%arr.length];
    }
}
