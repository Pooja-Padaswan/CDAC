package example.com;

public class Assign_2_Que_2_3_f {

	    public static void main(String[] args) {
	        String strNumber = "Ab12Cd3";
	        try {
	            short number = Short.parseShort(strNumber);
	            System.out.println("String to short: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


	