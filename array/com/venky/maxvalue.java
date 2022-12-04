package com.venky;

import java.util.Scanner;

public class maxvalue {
    public static void main(String [] arg) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int j = 0; j < list.length; j++) {

            list[j] = sc.nextInt();
        }
        int ans=maxvalue(list);
        System.out.println(ans);
    }
    static int maxvalue(int[] list)
    {
        int max=list[0];
        for(int i=0;i<list.length;i++)
        {
            if(max<list[i])
            {
                max=list[i];

            }
        }
        return max;
    }
}
