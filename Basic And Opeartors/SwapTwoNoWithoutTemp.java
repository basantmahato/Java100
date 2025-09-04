public class SwapTwoNoWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract new value of a with  b
        a = a - b; // Step 3: Subtract new value of b from  a
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
