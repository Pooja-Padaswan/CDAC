//1. Working with java.lang.Boolean

/*d. Declare a method-local variable strStatus of type String with the value "1" or "0" 
 and attempt to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").
 */

package example.com;

public class Assign_2_Que_1_4 {

	    public static void main(String[] args) {
	        String strStatusOne = "1";
	        String strStatusZero = "0";

	        boolean statusOne = Boolean.parseBoolean(strStatusOne);
	        boolean statusZero = Boolean.parseBoolean(strStatusZero);

	        System.out.println("Converted '1' to boolean: " + statusOne);
	        System.out.println("Converted '0' to boolean: " + statusZero);
	   
	}

}
