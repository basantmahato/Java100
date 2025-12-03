
import java.util.Scanner;



public class P7_floatSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating-point number: ");
        float number = sc.nextFloat();
        float square = number * number;
        System.out.println("Square of the number: " + square);
        sc.close();
        
    }
    
}
