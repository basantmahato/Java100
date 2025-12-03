import java.util.Scanner;

public class P6_floatInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating-point number: ");
        float number = sc.nextFloat();
        System.out.println("You entered: " + number);
        sc.close();

    }
    
}