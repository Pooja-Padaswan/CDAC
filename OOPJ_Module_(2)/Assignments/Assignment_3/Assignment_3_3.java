/*3. BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1. Accept weight (in kilograms) and height (in meters) from the user.
2. Calculate the BMI using the formula:
o BMI Calculation: BMI = weight / (height * height)
3. Classify the BMI into one of the following categories:
o Underweight: BMI < 18.5
o Normal weight: 18.5 ≤ BMI < 24.9
o Overweight: 25 ≤ BMI < 29.9
o Obese: BMI ≥ 30
4. Display the BMI value and its classification.
Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method.
*/

package example.com;
import java.util.Scanner;

public class Assignment_3_3 {
    
    double weight;
    double height;
    double bmi;
    String classification;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        height = sc.nextDouble();
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    public void printRecord() {
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("You are classified as: " + classification);
    }

    public static void main(String[] args) {
        Assignment_3_3 as = new Assignment_3_3();
        as.acceptRecord();
        as.calculateBMI();
        as.classifyBMI();
        as.printRecord();
    }
}

