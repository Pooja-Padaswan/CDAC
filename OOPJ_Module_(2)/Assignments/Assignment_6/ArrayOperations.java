package Assignment_06;

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
       System.out.println("Enter 5 integers:");
       
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
 
        System.out.println("\nValues in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ": " + arr[i]);
        }
    }
}
