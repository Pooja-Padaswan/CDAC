//4. Working with java.lang.Integer
/*d. Declare a method-local variable number of type int with some value and convert it to a String using the toString method.
  (Hint: Use Integer.toString(int)).
 
 */


package example.com;

public class Assing_2_Que_4_d {

	
	    public static void main(String[] args) {
	        int number = 1500;
	        String numberString = Integer.toString(number);
	        System.out.println("Int to String: " + numberString);
	    }
	}


	