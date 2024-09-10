//2. Working with java.lang.Byte
/*d. Declare a method-local variable number of type byte with some value and convert
it to a String using the toString method. (Hint: Use Byte.toString(byte)).
*/


package example.com;

public class Assign_2_Que_2_d {

		    public static void main(String[] args) {
		        byte number = 10;
		        String numberString = Byte.toString(number);
		        System.out.println("Byte to String: " + numberString);
		    }
		}

	