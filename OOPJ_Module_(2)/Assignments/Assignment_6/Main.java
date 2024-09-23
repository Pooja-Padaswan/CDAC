package Assignment_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        

        System.out.println("Default values in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ": " + arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 5 integers to update the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for element " + i + ": ");
            arr[i] = sc.nextInt();
        }

  
        System.out.println("\nUpdated values in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ": " + arr[i]);
        }
    }
}
