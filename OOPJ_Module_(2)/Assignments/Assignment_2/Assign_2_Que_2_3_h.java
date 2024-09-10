//3. Working with java.lang.Short
/*h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf().
  (Hint: Use Short.valueOf(String)).
 */
package example.com;

public class Assign_2_Que_2_3_h {

	
	    public static void main(String[] args) {
	        short number = 300;
	        Short wrapperShort = Short.valueOf(number);
	        System.out.println("Short value to wrapper class: " + wrapperShort);
	    }
	}


	