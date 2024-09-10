//b. Declare a method-local variable status of type boolean with the value true and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).

package example.com;

public class Assign_2_Que_2 {


	    public static void main(String[] args) {
	        String strStatus = "true";
	        boolean status = Boolean.parseBoolean(strStatus);
	        System.out.println("Converted String to boolean: " + status);
	    }
	

}
