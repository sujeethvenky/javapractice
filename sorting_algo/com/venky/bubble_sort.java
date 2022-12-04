package com.venky;
// all three sorting algorithm 1- bubble 2- selection 3- insertion
import java.util.Arrays;

public class bubble_sort {
     public static void main(String[] args){
            int[] arr ={100,18,19};
//            selectionalgo(arr);
//         int[] arr ={1,2,3,4,5};
         insertionalgo(arr);
         System.out.println(Arrays.toString(arr));
     }
     static void insertionalgo(int[] array){
         boolean swapped = false;
         for(int i=0;i<array.length-1;i++)    //venky : pass case running till i=3 it not usefull to run loop for extra step;
         {
             for(int j=i+1;j>0;j--){
                 if(array[j-1] > array[j]){
                     swap(array,j-1,j);
                     swapped = true;
                 }
                 else{
                     break;
                 }
             }
             if(swapped == false) {
                 break;
             }
         }

     }
     static void selectionalgo(int[] array){
         for(int i = 0;i<array.length;i++)
         {
             int last = array.length-i-1;
             int maxindex = getmaximum(array,0,last);
             swap(array,maxindex,last);
         }
     }

    static int getmaximum(int[] array,int start,int last) {
         int max = start;
         for(int i=start;i<=last;i++)
         {
            if(array[max] < array[i])
            {
                max = i;
            }
         }
         return max;
    }
    static void swap(int[] array,int first , int second)
    {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }


    static void bubblealgo(int[] array){
         //we have to run for n-1 times and one fix variable;
         boolean swapped = false;
         for(int i=0;i< array.length;i++)
         {
             for(int j=1;j<array.length-i;j++)
             {
                 if(array[j-1] > array[j])
                 {
                     int temp = array[j];
                     array[j] = array[j-1];
                     array[j-1] = temp;
                     swapped = true;
                 }
             }
             if(swapped == false){   //beacuse of this condition if we donot swap inside for loop that means array is sorted then we can directlty we can sayit is sorted
                 break;
             }
         }

     }
}
