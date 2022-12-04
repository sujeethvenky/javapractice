package com.venky;

class missing {
    public int missingNumber(int[] nums) {

        return sort(nums);
    }
    static int sort(int[] array){
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
    //    checking for missing nmber 
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
    static void swap(int[] arr,int first,int second){
         int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}