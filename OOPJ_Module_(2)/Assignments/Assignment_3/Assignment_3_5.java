/*5. Toll Booth Revenue Management
Develop a system to simulate a toll booth for collecting revenue. The system should:
1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
2.	Accept the number of vehicles of each type passing through the toll booth.
3.	Calculate the total revenue based on the toll rates and number4
 of vehicles.
4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
•	Toll Rate Examples:
o	Car: ₹50.00
o	Truck: ₹100.00
o	Motorcycle: ₹30.00
Define class TollBoothRevenueManager with methods acceptRecord, setTollRates, calculateRevenue & printRecord and test the functionality in main method.

*/
package example.com;
import java.util.Scanner;
public class Assignment_3_5 {


	    double carRate;
	    double truckRate;
	    double motorcycleRate;

	    int carCount;
	    int truckCount;
	    int motorcycleCount;

	    double totalRevenue;

	    public void acceptRecord() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the toll rate for cars: ₹");
	        carRate = sc.nextDouble();
	        System.out.print("Enter the toll rate for trucks: ₹");
	        truckRate = sc.nextDouble();
	        System.out.print("Enter the toll rate for motorcycles: ₹");
	        motorcycleRate = sc.nextDouble();

	        System.out.print("Enter the number of cars: ");
	        carCount = sc.nextInt();
	        System.out.print("Enter the number of trucks: ");
	        truckCount = sc.nextInt();
	        System.out.print("Enter the number of motorcycles: ");
	        motorcycleCount = sc.nextInt();
	    }

	    public void calculateRevenue() {
	        totalRevenue = (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
	    }

	    public void printRecord() {
	        int totalVehicles = carCount + truckCount + motorcycleCount;
	        System.out.println("Total number of vehicles: " + totalVehicles);
	        System.out.printf("Total revenue collected: ₹%.2f\n", totalRevenue);
	    }

	    public static void main(String[] args) {
	    	Assignment_3_5 manager = new Assignment_3_5();
	        manager.acceptRecord();
	        manager.calculateRevenue();
	        manager.printRecord();
	    }
	}