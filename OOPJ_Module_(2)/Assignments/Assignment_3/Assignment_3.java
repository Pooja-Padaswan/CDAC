package example.com;
import java.util.Scanner;

public class Assignment_3 {
    double principal;
    double annualInterestRate;
    int loanTerm;
    double monthlyPayment;
    double totalPayment;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount (₹): ");
        principal = sc.nextDouble();

        System.out.println("Enter the annual interest rate (%): ");
        annualInterestRate = sc.nextDouble();

        System.out.println("Enter the loan term (in years): ");
        loanTerm = sc.nextInt();

        sc.close();

        calculateMonthlyPayment();
        totalPayment = monthlyPayment * loanTerm * 12;
    }

    private void calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;

        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public void printRecord() {
        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Payment over the life of the loan: %.2f\n", totalPayment);
    }

    public static void main(String[] args) {
        Assignment_3 loanCalculator = new Assignment_3();
        loanCalculator.acceptRecord();
        loanCalculator.printRecord();
    }
}
