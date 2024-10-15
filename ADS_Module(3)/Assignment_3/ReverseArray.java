import java.util.Scanner;

class ReverseArray {
    public static void reverse(int array[], int start, int end) {
        if(start >= end) {
            return;
        }

        int temp = array[end];
        array[end] = array[start];
        array[start] = temp;

        reverse(array, start+1, end-1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // No of array elements
        int n = sc.nextInt();
        int[] array = new int[n];
        
        // Prompting user for array elements
        for(int i = 0; i< n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Function Call
        reverse(array,0,n-1); 
        
        // Printing reversed array
        for(int i = 0; i<n;i++){
            System.out.print(array[i] + " ");
        }
    }
}