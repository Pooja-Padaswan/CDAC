/*Assignment_3_4 .. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define class DiscountCalculator with methods acceptRecord, calculateDiscount & printRecord and test the functionality in main method.

*/


package example.com;
import java.util.Scanner;
public class Assignment_3_4 {
	

	    double originalPrice;
	    double discountRate;
	    double discountAmount;
	    double finalPrice;

	    public void acceptRecord() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the original price of the item: ");
	        originalPrice = sc.nextDouble();
	        System.out.print("Enter the discount percentage: ");
	        discountRate = sc.nextDouble();
	    }

	    public void calculateDiscount() {
	        discountAmount = originalPrice * (discountRate / 100);
	        finalPrice = originalPrice - discountAmount;
	    }

	    public void printRecord() {
	        System.out.printf("Discount Amount: %.2f\n", discountAmount);
	        System.out.printf("Final Price after Discount: %.2f\n", finalPrice);
	    }

	    public static void main(String[] args) {
	    	Assignment_3_4 calculator = new Assignment_3_4();
	        calculator.acceptRecord();
	        calculator.calculateDiscount();
	        calculator.printRecord();
	    }
	}
