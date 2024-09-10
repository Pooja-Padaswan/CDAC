//6. Working with java.lang.Float
/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value.
    (Hint: parseFloat method will throw a NumberFormatException).
 */
package example.com;

public class Assign_2_Que_6_f {

	    public static void main(String[] args) {
	        String strNumber = "Ab12Cd3";
	        try {
	            float number = Float.parseFloat(strNumber);
	            System.out.println("String to float: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


	
