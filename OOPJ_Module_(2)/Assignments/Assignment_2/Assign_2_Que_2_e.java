//2. Working with java.lang.Byte
/*e. Declare a method-local variable strNumber of type String with some value and convert it 
to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).
*/


package example.com;

public class Assign_2_Que_2_e {

	    public static void main(String[] args) {
	        String strNumber = "15";
	        byte number = Byte.parseByte(strNumber);
	        System.out.println("String to byte: " + number);
	    
	}

}
