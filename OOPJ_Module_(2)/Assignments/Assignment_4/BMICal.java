// File: BMITracker.java
package BMICalculator;
public class BMICal {
    private double weight;
    private double height;

    // Constructor
    public BMICal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Getter and Setter for weight
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }

    // Method to classify BMI
    public String classifyBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Weight: %.2f kg, Height: %.2f m, BMI: %.2f (%s)",
                             weight, height, calculateBMI(), classifyBMI());
    }
}
