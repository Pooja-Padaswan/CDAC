package Assig_4_mam;

public class WideningConv {

	    public static void main(String[] args) {
	     
	        int num = 42;
	        double numDouble = num; 
	        System.out.println("Widening from int to double: " + numDouble);

	 
	        float numFloat = num; 
	        System.out.println("Widening from int to float: " + numFloat);

	      
	        boolean numBoolean = (num != 0); 
	        System.out.println("Manual conversion from int to boolean: " + numBoolean);

	   
	        String numString = Integer.toString(num);
	        System.out.println("Manual conversion from int to String: " + numString);
	    }
	}
