public class calcUsingIfElse {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '+';

        if (operator == '+') {
            System.out.println("Addition: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Subtraction: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Multiplication: " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Invalid operator.");
        }
    }
}
