import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0,sum=0;
        int original=n;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if(original == sum)
        {
            System.out.println("is amstrong");
        }
        else
        {
            System.out.println("is not amstrong");
        }


    }
}
