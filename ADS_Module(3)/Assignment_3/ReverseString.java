class ReverseString {
    
    // Recursive method to reverse a string
    public static String reverse(String str) {
        // Base condition: if the string is empty, return the empty string
        if (str.isEmpty()) {
            return str;
        }

        // Recursively call the method to reverse the remaining string and append the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        // Directly calling the recursive method from main

        // Test Case 1
        String input1 = "hello";
        System.out.println("Output: " + reverse(input1));  // Expected Output: "olleh"

        // Test Case 2
        String input2 = "Java";
        System.out.println("Output: " + reverse(input2));  // Expected Output: "avaJ"
    }
}
