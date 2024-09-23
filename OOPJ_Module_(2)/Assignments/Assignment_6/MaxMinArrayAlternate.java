package Assignment_06;

import java.util.Scanner;

public class MaxMinArrayAlternate {

    public static void main(String[] args) {
  
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
           System.out.println("Enter the Array Element:");
            arr[i] = sc.nextInt();
        }

      
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
