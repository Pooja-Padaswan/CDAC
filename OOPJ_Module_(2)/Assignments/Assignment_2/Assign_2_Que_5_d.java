//5. Working with java.lang.Long
/*d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. 
 * (Hint: Use Long.toString(long)).
 */
package example.com;


public class Assign_2_Que_5_d {


	    public static void main(String[] args) {
	        long number = 1234567890L;
	        String numberString = Long.toString(number);
	        System.out.println("Long to String: " + numberString);
	    }
	}


	
