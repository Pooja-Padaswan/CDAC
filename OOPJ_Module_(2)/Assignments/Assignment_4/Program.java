package BMICalculator;
//File: Program.java
import java.util.Scanner;

public class Program {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BMICal bmiTracker = null;
     int choice;

     // Loop until the user chooses to exit
     while (true) {
         BMITrackerUtil.menuList();
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 bmiTracker = BMITrackerUtil.acceptRecord();
                 System.out.println("Data recorded successfully.");
                 break;
             case 2:
                 if (bmiTracker != null) {
                     BMITrackerUtil.printRecord(bmiTracker);
                 } else {
                     System.out.println("No record found. Please enter weight and height first.");
                 }
                 break;
             case 3:
                 System.out.println("Exiting...");
                 scanner.close();
                 return; // Exit the program
             default:
                 System.out.println("Invalid choice, please try again.");
         }
     }
 }
}
