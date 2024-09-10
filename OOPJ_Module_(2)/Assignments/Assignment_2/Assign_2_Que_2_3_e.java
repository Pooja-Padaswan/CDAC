
//3. Working with java.lang.Short
/* e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method.
 *  (Hint: Use Short.parseShort(String)).
 *  
 */
package example.com;

public class Assign_2_Que_2_3_e {


	    public static void main(String[] args) {
	        String strNumber = "1234";
	        short number = Short.parseShort(strNumber);
	        System.out.println("String to short: " + number);
	    }
	}


	
