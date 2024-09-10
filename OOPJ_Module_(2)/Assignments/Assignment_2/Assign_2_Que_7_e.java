//7. Working with java.lang.Double
/*e. Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method.
   (Hint: Use Double.parseDouble(String)).
 */

package example.com;

public class Assign_2_Que_7_e {


	    public static void main(String[] args) {
	        String strNumber = "123.456";
	        double number = Double.parseDouble(strNumber);
	        System.out.println("String to double: " + number);
	    }
	}


	