package Assignment_06;
import java.util.Scanner;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

    
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        Arrays.sort(array);

 
        int newLength = 1; // The first element is always unique
        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                array[newLength] = array[i];
                newLength++;
            }
        }

   
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


