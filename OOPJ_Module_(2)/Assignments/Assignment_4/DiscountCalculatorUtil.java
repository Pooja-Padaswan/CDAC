package Dis_Retail.com;



	import java.util.Scanner;

	public class DiscountCalculatorUtil {
	    
	    // Accept user input for the original price and discount rate
	    public static DiscountCalculator acceptRecord() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the original price: ₹");
	        double originalPrice = scanner.nextDouble();
	        
	        System.out.print("Enter the discount rate (in %): ");
	        double discountRate = scanner.nextDouble();
	        
	        return new DiscountCalculator(originalPrice, discountRate);
	    }

	    // Print the details of the discount calculation
	    public static void printRecord(DiscountCalculator calculator) {
	        calculator.calculateDiscountAmount(); // Calculate discount amount
	        calculator.calculateFinalPrice();     // Calculate final price
	        
	        System.out.println(calculator);
	    }

	    // Display menu options
	    public static void menuList() {
	        System.out.println("1. Enter new discount details");
	        System.out.println("2. Exit");
	    }
	}
