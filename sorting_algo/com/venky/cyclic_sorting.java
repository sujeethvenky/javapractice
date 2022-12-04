package com.venky;

import java.util.Arrays;

public class cyclic_sorting {
    public static void main(String[] args){
        int[] arr ={3,5,2,1,4,6};   //we should have element in array such a way like we have 5 element then it should be from 1 to 5 No number should be missing from the that
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] array){
        int i=0;
        while(i<array.length){
            int correct = array[i]-1;
            if(array[i] != array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}


//when index is given from 1 to n (a,f,n )
