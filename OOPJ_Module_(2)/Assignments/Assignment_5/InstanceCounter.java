package Assign_5;

public class InstanceCounter {
	
	    // Static field to track the number of instances
	    private static int instanceCount = 0;

	    // Constructor to increment the instance count each time an object is created
	    public InstanceCounter() {
	        instanceCount++;
	    }

	    // Static method to retrieve the current instance count
	    public static int getInstanceCount() {
	        return instanceCount;
	    }

	    // toString method to display the object's information
	    @Override
	    public String toString() {
	        return "InstanceCounter object created. Current instance count: " + instanceCount;
	    }
	    
	    // Static initializer block (optional, but can be used for additional setup)
	    static {
	        System.out.println("Static initializer called: Ready to count instances.");
	    }
	    
	    // Main method to test the class
	    public static void main(String[] args) {
	        // Creating instances of InstanceCounter
	        InstanceCounter obj1 = new InstanceCounter();
	        System.out.println(obj1);
	        
	        InstanceCounter obj2 = new InstanceCounter();
	        System.out.println(obj2);
	        
	        InstanceCounter obj3 = new InstanceCounter();
	        System.out.println(obj3);
	        
	        // Print total instance count using the static method
	        System.out.println("Total number of instances: " + InstanceCounter.getInstanceCount());
	    }
	}
