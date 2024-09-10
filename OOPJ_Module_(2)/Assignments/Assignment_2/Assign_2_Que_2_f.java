//2. Working with java.lang.Byte
/*f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3"
  and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).

*/
package example.com;

public class Assign_2_Que_2_f {

	    public static void main(String[] args) {
	        String strNumber = "Ab12Cd3";
	        try {
	            byte number = Byte.parseByte(strNumber);
	            System.out.println("String to byte: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


