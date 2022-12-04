package com.venky;
//https://leetcode.com/problems/sqrtx/description/
public class squarerootbinarysearch {
    public static void main(String[] arg) {
        System.out.println(mySqrt(36));
    }


        static  int mySqrt(int x) {
            return binarayseach(x);
        }
        static int binarayseach(int num)
        {
            long start = 0;  ///we are using long because of when we multiply 2 big intger then output will be big integer so we use long data type;
            long end = num;
            long ans  = -1 ;

            while(start<=end)
            {
                long mid = start + (end - start)/2;
                long sqaure = mid*mid;
                if(sqaure == num)
                {
                    return (int)mid;  //type casting from lonn to int type
                }
                if((sqaure) < num )  //when squaere of the number is less then given number that means our ans is lies right side;
                {
                    ans = mid;   //this can be ans ;
                    start = mid+1;
                }
                else
                {
                    end = mid -1;
                }
            }
            return (int)ans;  // same condition as the line number 17
        }
}

