/*  10.  Arithmetic Operations with Command Line Input
Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).

*/

package example.com;
import java.util.Scanner;
public class Assign_2_Que_10 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        int num1 = sc.nextInt();

	        System.out.println("Enter second number:");
	        int num2 = sc.nextInt();

	        System.out.println("Enter an arithmetic operator (+, -, *, /):");
	        char operator = sc.next().charAt(0);

	        int result = 0;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Division by zero is not allowed.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid operator.");
	                return;
	        }

	        System.out.println("Result: " + result);
	    }
	}
