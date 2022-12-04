import java.util.Scanner;

public class reverse {
    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nvalue=n;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;

            n = n / 10;
            ans = ans * 10 + rem;

        }
        System.out.println(ans);
        if (nvalue==ans) {
            System.out.println("yes it is palindrone");
        }
        else {
            System.out.println("yes it not a palindrone");
        }
    }
}
