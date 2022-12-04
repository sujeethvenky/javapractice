package com.venky;

public class searchinrotated {
    public static void main(String[] arg){
//        int[] arr ={3,4,5,6,7,8,0,1,2};
//        int[] arr ={1,2,3,4,5,6};
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
//        int ans = findpivot(arr);
//        System.out.println(arr[ans]);
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target)
    {
        int pivot = findpivot(arr);
        if(pivot == -1)
        {
            // normal binary search
            return binary(arr,target,0,arr.length-1);
        }
        if(  arr[pivot]== target)
        {
            return pivot;
        }
        if(target >= arr[0])
        {
            return binary(arr,target,0,pivot-1);
        }
            return binary(arr,target,pivot+1,arr.length-1);
    }
    static int binary(int[] arr ,int target,int start,int end)
    {
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

    static int findpivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            // to find pivot we have 4 case
            // mid>end mid>start are the condition to check this .
            if (mid<end && arr[mid] > arr[mid + 1]) {
                return  mid ;
            }
            if (mid>start && arr[mid - 1] > arr[mid]) {

                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else if(arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
