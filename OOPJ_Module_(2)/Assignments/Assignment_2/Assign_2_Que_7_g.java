//7. Working with java.lang.Double
/* g. Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf().
   (Hint: Use Double.valueOf(double)).
 */

package example.com;

public class Assign_2_Que_7_g {

	    public static void main(String[] args) {
	        double number = 987.654;
	        Double wrapperDouble = Double.valueOf(number);
	        System.out.println("Double value to wrapper class: " + wrapperDouble);
	    }
	}


	
