package com.venky;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/854570802/
// 1 to n
public class dissappering {
    public List<Integer> findDisappearedNumbers(int[] nums)  {
//    int[] arr = {4,3,2,7,8,2,3,1};
//    sort(arr);

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(nums[j] != j+1) {
                    ans.add(j + 1);
                }
        }
            return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
