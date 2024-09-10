//7. Working with java.lang.Double
/*h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf().
     (Hint: Use Double.valueOf(String)).
 */
package example.com;

public class Assign_2_Que_7_h {


	    public static void main(String[] args) {
	        String strNumber = "987.654";
	        Double wrapperDouble = Double.valueOf(strNumber);
	        System.out.println("String to wrapper Double: " + wrapperDouble);
	    }
	}

	
