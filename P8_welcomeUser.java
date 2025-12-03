import java.util.*;


public class P8_welcomeUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
        sc.close();
        
    }
    
}
