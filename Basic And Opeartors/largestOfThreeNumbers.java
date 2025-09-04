public class largestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int largest;
        if (a>=b && a>=c) {
            largest = a;
            System.out.println("Largest number is: " + largest);
        } else if (b>=a && b>=c) {
            largest = b;
            System.out.println("Largest number is: " + largest);
        } else if (c>=a && c>=b) {
            largest = c;
            System.out.println("Largest number is: " + largest);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
