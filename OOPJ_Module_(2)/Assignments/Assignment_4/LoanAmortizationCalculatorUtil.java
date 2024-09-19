package Loan.com;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {

    // Accept user input for loan details
    public static LoanAmortizationCalculator acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ₹");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter loan term (in years): ");
        int loanTerm = scanner.nextInt();
        
        return new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    // Print the records
    public static void printRecord(LoanAmortizationCalculator calculator) {
        System.out.println(calculator);
    }

    // Display menu options
    public static void menuList() {
        System.out.println("1. Enter new loan details");
        System.out.println("2. Exit");
    }
}
