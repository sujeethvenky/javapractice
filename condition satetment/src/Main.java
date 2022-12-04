import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int count=2;
        int n = sc.nextInt();
        while(count<=n)
        {
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}