/*
2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.
*/

package example.com;

import java.util.Scanner;

public class Assignment_3_2 {

    double principal;
    double annualInterestRate;
    int numberOfCompounds;
    int years;
    double futureValue;
    double totalInterest;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the initial investment amount (₹): ");
        principal = sc.nextDouble();

        System.out.println("Enter the annual interest rate (%): ");
        annualInterestRate = sc.nextDouble();

        System.out.println("Enter the number of times interest is compounded per year: ");
        numberOfCompounds = sc.nextInt();

        System.out.println("Enter the investment duration (in years): ");
        years = sc.nextInt();

        sc.close();

        calculateFutureValue();
        totalInterest = futureValue - principal;
    }

    private void calculateFutureValue() {
        double ratePerCompound = annualInterestRate / 100 / numberOfCompounds;
        int totalCompounds = numberOfCompounds * years;

        futureValue = principal * Math.pow(1 + ratePerCompound, totalCompounds);
    }

    public void printRecord() {
        // Round values to 2 decimal places
        double roundedFutureValue = Math.round(futureValue * 100.0) / 100.0;
        double roundedTotalInterest = Math.round(totalInterest * 100.0) / 100.0;

        System.out.println("Future Value: " + roundedFutureValue);
        System.out.println("Total Interest Earned: " + roundedTotalInterest);
    }

    public static void main(String[] args) {
    	Assignment_3_2 calculator = new Assignment_3_2();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}

