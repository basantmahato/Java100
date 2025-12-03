
import java.util.Scanner;

public class P5_stringInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        sc.close();

    }
    
}