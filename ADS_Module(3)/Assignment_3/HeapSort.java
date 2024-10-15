import java.util.Scanner;

class Heapsort {
    
    // Function to heapify a subtree rooted with node i which is an index in arr[].
    void heapify(int arr[], int n, int i) {
        int largest = i; // Root
        int l = 2 * i + 1; // Left Child
        int r = 2 * i + 2; // Right Child

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function to do heap sort
    void heapsort(int arr[]) {
        int n = arr.length;

        // Build a maxheap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Function to display the array
    void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Heapsort h1 = new Heapsort();

        System.out.println("Original array:");
        h1.display(arr);
        
        h1.heapsort(arr);

        System.out.println("Sorted array:");
        h1.display(arr);
        
        scanner.close();
    }
}
