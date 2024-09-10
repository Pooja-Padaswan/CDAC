/*8. Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
o	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).
*/

package example.com;

public class Assign_2_8 {


	    public static void main(String[] args) {
	        // Initialize variables for each primitive type
	        byte byteValue = 100;
	        short shortValue = 5000;
	        int intValue = 100000;
	        long longValue = 500000L;
	        float floatValue = 12.34f;
	        double doubleValue = 12345.6789;
	        char charValue = 'X';
	        boolean booleanValue = true;

	        // Convert each primitive type to String using toString() method of wrapper class
	        System.out.println("Using toString() method:");
	        System.out.println("byte: " + Byte.toString(byteValue));
	        System.out.println("short: " + Short.toString(shortValue));
	        System.out.println("int: " + Integer.toString(intValue));
	        System.out.println("long: " + Long.toString(longValue));
	        System.out.println("float: " + Float.toString(floatValue));
	        System.out.println("double: " + Double.toString(doubleValue));
	        System.out.println("char: " + Character.toString(charValue));
	        System.out.println("boolean: " + Boolean.toString(booleanValue));

	        // Convert each primitive type to String using String.valueOf() method
	        System.out.println("\nUsing String.valueOf() method:");
	        System.out.println("byte: " + String.valueOf(byteValue));
	        System.out.println("short: " + String.valueOf(shortValue));
	        System.out.println("int: " + String.valueOf(intValue));
	        System.out.println("long: " + String.valueOf(longValue));
	        System.out.println("float: " + String.valueOf(floatValue));
	        System.out.println("double: " + String.valueOf(doubleValue));
	        System.out.println("char: " + String.valueOf(charValue));
	        System.out.println("boolean: " + String.valueOf(booleanValue));
	    }
	}


	
