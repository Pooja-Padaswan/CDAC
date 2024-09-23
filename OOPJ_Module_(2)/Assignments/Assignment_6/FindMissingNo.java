package Assignment_06;
import java.util.Scanner;

public class FindMissingNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (N-1): ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int N = n + 1;
        int totalSum = 0;
        
        for (int i = 1; i <= N; i++) {
            totalSum += i;
        }
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += array[i];
        }

        int missingNumber = totalSum - arraySum;

        System.out.println("The missing number is: " + missingNumber);
    }
}

