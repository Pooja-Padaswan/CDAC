
/*e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method.
    (Hint: Use Long.parseLong(String)).
 */

package example.com;

public class Assign_2_Que_5_e {

	
	    public static void main(String[] args) {
	        String strNumber = "1234567890";
	        long number = Long.parseLong(strNumber);
	        System.out.println("String to long: " + number);
	    }
	}


	
