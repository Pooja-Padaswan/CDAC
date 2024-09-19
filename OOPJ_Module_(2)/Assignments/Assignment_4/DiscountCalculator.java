package Dis_Retail.com;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    // Constructor
    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
    }

    // Calculate discount amount
    public void calculateDiscountAmount() {
        discountAmount = originalPrice * (discountRate / 100);
    }

    // Calculate final price
    public void calculateFinalPrice() {
        finalPrice = originalPrice - discountAmount;
    }

    // Getter methods
    public double getDiscountAmount() {
    	return discountAmount; }
    public double getFinalPrice() { 
    	return finalPrice; }
    
    // Setter methods
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
        
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        calculateDiscountAmount(); // Recalculate values
        calculateFinalPrice();
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Original Price: ₹%.2f\nDiscount Amount: ₹%.2f\nFinal Price: ₹%.2f",
                             originalPrice, discountAmount, finalPrice);
    }
}

