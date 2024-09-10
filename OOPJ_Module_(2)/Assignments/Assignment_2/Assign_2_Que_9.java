
//9. Default Values of Primitive Types
/*Declare variables of each primitive type as fields of a class and check their default values.
  (Note: Default values depend on whether the variables are instance variables or static variables).
 */
package example.com;

public class Assign_2_Que_9 {

	    // Instance variables (non-static)
	    byte instanceByte;
	    short instanceShort;
	    int instanceInt;
	    long instanceLong;
	    float instanceFloat;
	    double instanceDouble;
	    char instanceChar;
	    boolean instanceBoolean;

	    // Static variables
	    static byte staticByte;
	    static short staticShort;
	    static int staticInt;
	    static long staticLong;
	    static float staticFloat;
	    static double staticDouble;
	    static char staticChar;
	    static boolean staticBoolean;

	    public static void main(String[] args) {
	        // Create an instance of the class to access instance variables
	    	Assign_2_Que_9 obj = new Assign_2_Que_9();

	        // Display default values of instance variables
	        System.out.println("Default values of instance variables:");
	        System.out.println("byte: " + obj.instanceByte);
	        System.out.println("short: " + obj.instanceShort);
	        System.out.println("int: " + obj.instanceInt);
	        System.out.println("long: " + obj.instanceLong);
	        System.out.println("float: " + obj.instanceFloat);
	        System.out.println("double: " + obj.instanceDouble);
	        System.out.println("char: [" + obj.instanceChar + "]"); // Empty char will show as a blank space
	        System.out.println("boolean: " + obj.instanceBoolean);

	        // Display default values of static variables
	        System.out.println("\nDefault values of static variables:");
	        System.out.println("byte: " + staticByte);
	        System.out.println("short: " + staticShort);
	        System.out.println("int: " + staticInt);
	        System.out.println("long: " + staticLong);
	        System.out.println("float: " + staticFloat);
	        System.out.println("double: " + staticDouble);
	        System.out.println("char: [" + staticChar + "]"); // Empty char will show as a blank space
	        System.out.println("boolean: " + staticBoolean);
	    }
	}
	

	