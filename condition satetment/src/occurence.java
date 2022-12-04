import java.util.Scanner;

public class occurence {
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==3)
            {
                count++;
            }
            n=n/10;

        }
        System.out.print(count);
    }
}
