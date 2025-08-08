public class evenOdd {
    public static void main(String[] args) {
        int number = 15;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else if (number % 2 != 0) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
