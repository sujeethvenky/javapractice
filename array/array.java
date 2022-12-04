import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String [] arg) {
//        Scanner sc = new Scanner(System.in);
//        int[] rno =new int[5];
//        for(int i=0;i<5;i++){
//            System.out.println(rno[i]);
//        }
//        String[] name = new String[5];
//        for(int i=0;i<5;i++){
////            System.out.println(name[i]);
////            if(name[i] == "null")
////            {
////                int count= 0;
////                count++;
////                System.out.println(count);
////            }
//        }
//
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int j = 0; j < list.length; j++) {

            list[j] = sc.nextInt();
        }
//        int[] list ={1,2,3,4,5,6};

//        swap(list, 2, 3);
//        System.out.println(Arrays.toString(list));
        reverse(list);
//        System.out.println(Arrays.toString(list));
    }
         static void swap(int[] list,int index1,int index2)
        {
            int temp = list[index1];
            list[index1]=list[index2];
            list[index2]=temp;


        }
        static void reverse(int[] list)
        {
            int start = 0;
            int end = list.length-1;
            while(start<end)
            {
                swap(list,start,end);
                start++;
                end--;
            }
            System.out.println(Arrays.toString(list));
        }



}
