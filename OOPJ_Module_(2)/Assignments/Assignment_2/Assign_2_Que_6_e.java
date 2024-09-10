//6. Working with java.lang.Float
/*e. Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method.
   (Hint: Use Float.parseFloat(String)).
 */
package example.com;

public class Assign_2_Que_6_e {

	
	    public static void main(String[] args) {
	        String strNumber = "123.45";
	        float number = Float.parseFloat(strNumber);
	        System.out.println("String to float: " + number);
	    }
	}


	
