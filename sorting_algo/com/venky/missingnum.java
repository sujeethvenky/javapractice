package com.venky;
//https://leetcode.com/problems/missing-number/submissions/854036558/
//amazon ,facebook question cyclic sort;
import java.util.Arrays;

public class missingnum {
    public static void main(String[] args){
        int[] arr = {0,1,3};
        sort(arr);
        System.out.println(sort(arr));
    }
    public static int sort(int[] array){
        int i=0;
        while(i<array.length){
            int correct = array[i];
            if(array[i] < array.length && array[i] != array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }
        ///
        //    checking for missing number
        for(int index=0;index<array.length;index++)
        {
            if(array[index] == index)
            {
                continue;
            }else{
                return index;
            }

        }
        return array.length;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
