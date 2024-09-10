//4. Working with java.lang.Integer
/*  f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value.
(Hint: parseInt method will throw a NumberFormatException). */


package example.com;

public class Assing_2_Que_4_f {

	
		    public static void main(String[] args) {
		        String strNumber = "Ab12Cd3";
		        try {
		            int number = Integer.parseInt(strNumber);
		            System.out.println("String to int: " + number);
		        } catch (NumberFormatException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
}
		