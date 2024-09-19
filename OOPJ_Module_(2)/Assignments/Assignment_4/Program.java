package Loan.com;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
        LoanAmortizationCalculator calculator = null;
        
        while (true) {
            util.menuList();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            
            if (option == 1) {
                calculator = util.acceptRecord();
                util.printRecord(calculator);
            } else if (option == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
        
        scanner.close();
    }
}
