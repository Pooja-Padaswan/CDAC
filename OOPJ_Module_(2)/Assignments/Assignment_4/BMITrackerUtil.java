package BMICalculator;

//File: BMITrackerUtil.java
import java.util.Scanner;

public class BMITrackerUtil {
 // Method to accept user input for weight and height
 public static BMICal acceptRecord() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter weight (kg): ");
     double weight = scanner.nextDouble();
     System.out.print("Enter height (m): ");
     double height = scanner.nextDouble();
     return new BMICal(weight, height);
 }

 // Method to print the BMI record
 public static void printRecord(BMICal bmiTracker) {
     System.out.println(bmiTracker.toString());
 }

 // Method to display menu options
 public static void menuList() {
     System.out.println("\nBMI Tracker Menu");
     System.out.println("1. Enter weight and height");
     System.out.println("2. Display BMI and classification");
     System.out.println("3. Exit");
 }
}

