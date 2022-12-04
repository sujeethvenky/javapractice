package com.venky;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/854624892/
class duplicatenumber {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        // check which is not in coorect index;
        return mnum(nums);
        
    }
    static int mnum(int[] nums){
        int ans = -1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
             ans = nums[j];   
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}