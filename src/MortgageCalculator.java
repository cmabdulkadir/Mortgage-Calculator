import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {

    private static final int MONTHS_IN_A_YEAR = 12;
    public static void main(String[] args) {


// Monthly payment formula
        // M = P  i(1 +i)^n/((1 +i)^n -1)

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scan.nextDouble();

        System.out.println("Enter the annual interest rate:");
        float annualInterestRate = scan.nextFloat();

        System.out.println("Enter the term of the loans in years:");
        int termYear = scan.nextInt();

        float monthlyInterestRate = annualInterestRate/MONTHS_IN_A_YEAR;

        int numberOfPayments = termYear * MONTHS_IN_A_YEAR;

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)/(Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        System.out.println("Monthly payments: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

    }
}