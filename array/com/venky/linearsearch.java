package com.venky;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    public static void main(String [] arg)
    {
        Scanner sc =new Scanner(System.in);

//        int target=sc.nextInt();
        int[] arr={11,22,33,44,55,66,99};
//        int ans=search(arr,target);
        String str = "sujeeth";
        char target2 = 'z';
        boolean ans2=search2(str,target2);
        System.out.println(Arrays.toString(str.toCharArray()));
//        if(ans==1)
        System.out.println(ans2);
//        else
//            System.out.println("not target found"+ans);
    }
    static int  search(int[] arr,int target)
    {
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return 1;
            }
        }
        return -1;
    }
    static boolean search2(String str, int target)
    {
        if(str.length() == target)
        {
            return false;
        }
        for(char ch:str.toCharArray())
        {
            if(ch == target)
                return true;
        }
        return false;
    }



}
