
/*g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf().
  (Hint: Use Short.valueOf(short)).
*/

package example.com;

public class Assign_2_Que_2_3_g {

	
	    public static void main(String[] args) {
	        short number = 300;
	        Short wrapperShort = Short.valueOf(number);
	        System.out.println("Short value to wrapper class: " + wrapperShort);
	    }
	}


	
