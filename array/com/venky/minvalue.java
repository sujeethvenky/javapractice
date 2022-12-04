package com.venky;

import java.util.Scanner;

public class minvalue {
    public static void main(String [] arg) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int j = 0; j < list.length; j++) {

            list[j] = sc.nextInt();
        }
        int ans=minvalue(list);
        System.out.println(ans);
    }
    static int minvalue(int[] list)
    {
        int min=list[0];
        for(int i=0;i<list.length;i++)
        {
            if(min>list[i])
            {
                min=list[i];

            }
        }
        return min;
    }


}
