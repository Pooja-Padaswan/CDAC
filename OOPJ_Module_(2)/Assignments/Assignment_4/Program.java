package Toll.com;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBoothRevenueManagerUtil util = new TollBoothRevenueManagerUtil();
        TollBoothRevenueManager manager = null;
        
        while (true) {
            util.menuList();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            
            if (option == 1) {
                manager = util.acceptRecord();
                util.printRecord(manager);
            } else if (option == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
        
        scanner.close();
    }
}
