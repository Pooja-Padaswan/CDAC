//7. Working with java.lang.Double
/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value.
    (Hint: parseDouble method will throw a NumberFormatException).
 */


package example.com;

public class Assign_2_Que_7_f {

	    public static void main(String[] args) {
	        String strNumber = "Ab12Cd3";
	        try {
	            double number = Double.parseDouble(strNumber);
	            System.out.println("String to double: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	
}
