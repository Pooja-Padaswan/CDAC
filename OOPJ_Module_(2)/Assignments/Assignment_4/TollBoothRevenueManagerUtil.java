package Toll.com;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
    
    // Accept user input for toll rates and vehicle counts
    public static TollBoothRevenueManager acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter toll rate for Car: ₹");
        double carRate = scanner.nextDouble();
        
        System.out.print("Enter toll rate for Truck: ₹");
        double truckRate = scanner.nextDouble();
        
        System.out.print("Enter toll rate for Motorcycle: ₹");
        double motorcycleRate = scanner.nextDouble();
        
        TollBoothRevenueManager manager = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);
        
        System.out.print("Enter number of Cars: ");
        manager.setNumCars(scanner.nextInt());
        
        System.out.print("Enter number of Trucks: ");
        manager.setNumTrucks(scanner.nextInt());
        
        System.out.print("Enter number of Motorcycles: ");
        manager.setNumMotorcycles(scanner.nextInt());
        
        return manager;
    }

    // Print the records
    public static void printRecord(TollBoothRevenueManager manager) {
        System.out.println(manager);
    }

    // Display menu options
    public static void menuList() {
        System.out.println("1. Enter new toll rates and vehicle counts");
        System.out.println("2. Exit");
    }
}
