//6. Working with java.lang.Float
/* h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using Float.valueOf().
 *  (Hint: Use Float.valueOf(String)).
 */

package example.com;

public class Assign_2_Que_6_h {

	    public static void main(String[] args) {
	        String strNumber = "987.65";
	        Float wrapperFloat = Float.valueOf(strNumber);
	        System.out.println("String to wrapper Float: " + wrapperFloat);
	    }
	}


	
