public class compoundIntrest {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate in percentage
        int time = 2; // Time in years
        int n = 4; // Number of times interest applied per time period

        // Compound Interest formula: A = P(1 + r/n)^(nt)
        double amount = principal * Math.pow((1 + rate / (n * 100)), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest is: " + compoundInterest);
    }
}
