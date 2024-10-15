public class RemoveArrayDuplicates {

    // Method to remove duplicates from a sorted array
    public static int removeDuplicates(int[] arr) {
        // Edge case: if the array is empty
        if (arr.length == 0) {
            return 0;
        }

        // Pointer for the next unique element
      

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is not equal to the previous one
            if (arr[i] != arr[i - 1]) {
                // Assign the unique element to the uniqueIndex position
               int uniqueIndex  = arr[i];
               
            }
        }

        // Return the length of the array without duplicates
        return uniqueIndex;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 1, 2};
        int newLength1 = removeDuplicates(arr1);
        System.out.println("New length: " + newLength1); // Output: 2

        // Test case 2
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        int newLength2 = removeDuplicates(arr2);
        System.out.println("New length: " + newLength2); // Output: 4
    }
}
