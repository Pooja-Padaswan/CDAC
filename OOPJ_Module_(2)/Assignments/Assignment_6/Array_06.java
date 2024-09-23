package Assignment_06;
import java.util.Scanner; class Array_06 {




	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: size of the first array
	        System.out.print("Enter the number of elements in the first array: ");
	        int n1 = sc.nextInt();

	        int[] array1 = new int[n1];

	        // Input: elements of the first array
	        System.out.println("Enter the elements of the first array: ");
	        for (int i = 0; i < n1; i++) {
	            array1[i] = sc.nextInt();
	        }

	        // Input: size of the second array
	        System.out.print("Enter the number of elements in the second array: ");
	        int n2 = sc.nextInt();

	        int[] array2 = new int[n2];

	        // Input: elements of the second array
	        System.out.println("Enter the elements of the second array: ");
	        for (int i = 0; i < n2; i++) {
	            array2[i] = sc.nextInt();
	        }

	        // Find the intersection of the two arrays
	        System.out.print("Intersection of the two arrays: ");
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < n2; j++) {
	                if (array1[i] == array2[j]) {
	                    System.out.print(array1[i] + " ");
	                    break; // Move to the next element of array1 after finding a match
	                }
	            }
	        }
	    }
	

	}
