//5. Working with java.lang.Long
/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value.
   (Hint: parseLong method will throw a NumberFormatException).
 */
package example.com;

public class Assign_2_Que_5_f {

	    public static void main(String[] args) {
	        String strNumber = "Ab12Cd3";
	        try {
	            long number = Long.parseLong(strNumber);
	            System.out.println("String to long: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}



	
