//6. Working with java.lang.Float
/*g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf().
    (Hint: Use Float.valueOf(float)).
 */
package example.com;

public class Assign_2_Que_6_g {

	    public static void main(String[] args) {
	        float number = 987.65f;
	        Float wrapperFloat = Float.valueOf(number);
	        System.out.println("Float value to wrapper class: " + wrapperFloat);
	    }
	}


	
