//1. Working with java.lang.Boolean
/*f. Declare a method-local variable strStatus of type String with the value "true" and convert 
it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).
*/
package example.com;

public class Assign_2_Que_1_6 {

	    public static void main(String[] args) {
	    
	        String strStatus = "true";

	        Boolean booleanStatus = Boolean.valueOf(strStatus);
	        
	        System.out.println("String to Boolean: " + booleanStatus);
	    }
	}

	
