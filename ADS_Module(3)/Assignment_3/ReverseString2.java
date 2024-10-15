/*3. Reverse a string using a stack.
•	Test Case 1:
Input: "hello"
Output: "olleh"
•	Test Case 2:
Input: "world"
Output: "dlrow"
*/
import java.util.Stack;
import java.util.Scanner;

public class ReverseString2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  String  str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        // Create a new array or use StringBuilder to store the reversed string
        //StringBuilder reversedStr = new StringBuilder();
		
		char[] reversedStr = new char[str.length()];
       int j = 0;
	 
  while (!st.isEmpty()) {
          reversedStr[j++] = st.pop();

        // Pop characters from the stack to reverse the string
       // while (!st.isEmpty()) {
       //     reversedStr.append(st.pop());
       // }

        // Print the reversed string
     //   System.out.println("Reversed String: " + reversedStr.toString());
  }
	  System.out.println("Reversed String: " + new String(reversedStr));
    
}
}