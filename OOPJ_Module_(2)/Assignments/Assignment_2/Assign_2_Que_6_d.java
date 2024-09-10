
//6. Working with java.lang.Float
/*d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method.
 *  (Hint: Use Float.toString(float)).
 */
package example.com;

public class Assign_2_Que_6_d {


	    public static void main(String[] args) {
	        float number = 123.45f;
	        String numberString = Float.toString(number);
	        System.out.println("Float to String: " + numberString);
	    }
	}



