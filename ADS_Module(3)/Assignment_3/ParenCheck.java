2. Check for balanced parentheses using a stack.
•	Test Case 1:
Input: "({[()]})"
Output: Balanced
•	Test Case 2:
Input: "([)]"
Output: Not Balanced

public class ParenCheck{

	public static void main(String args[]){
	
		String str ="{()}[]";
		
		Stack <<Character> st = new Stack<>();
		
		for(int i=0; i<=str.length(); i++)
		{
			if(str.charAt(i) == '{' || str.charAt(i)=='(' || str.charAt(i)=='['){
				st.push(str.charAt(i));
		}
		else if (!st.empty() && ((str.charAt(i) == ']' && st.peek() =='[') ||
			
			(str.charAt(i) == '}' && st.peek() =='{') || 
			(str.charAt(i) == ')' && st.peek() =='(')))
			{
				st.pop();
			}
			else {
				st.push(str.charAt(i));
				}
				}
			}
		}