import java.util.Scanner;

public class switchcase {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String department = sc.next();
        switch (id) {
            case 1 -> System.out.println("sujeeth");
            case 2 -> System.out.println("venky");
            case 3 -> {
                System.out.println("enter employee 3");
                switch (department) {
                    case "it" -> System.out.println("it deapartment");
                    case "management" -> System.out.println("management department");
                    default -> System.out.println("not valid");
                }
            }
            default -> System.out.println("select valid statement");
        }
    }
}
