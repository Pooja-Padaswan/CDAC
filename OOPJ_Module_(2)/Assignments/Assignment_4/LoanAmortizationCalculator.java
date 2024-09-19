package Loan.com;

public class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;
    private double monthlyPayment;
    private double totalAmountPaid;

    // Constructor
    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
        calculateMonthlyPayment();
    }

    // Getter methods
    public double getPrincipal() { return principal; }
    public double getAnnualInterestRate() { return annualInterestRate; }
    public int getLoanTerm() { return loanTerm; }
    public double getMonthlyPayment() { return monthlyPayment; }
    public double getTotalAmountPaid() { return totalAmountPaid; }

    // Setter methods
    public void setPrincipal(double principal) {
        this.principal = principal;
        calculateMonthlyPayment(); // Recalculate values
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        calculateMonthlyPayment(); // Recalculate values
    }
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
        calculateMonthlyPayment(); // Recalculate values
    }

    // Calculate the monthly payment
    public void calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        if (monthlyInterestRate > 0) {
            monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                             (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        } else {
            monthlyPayment = principal / numberOfMonths;
        }
        totalAmountPaid = monthlyPayment * numberOfMonths;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Principal: ₹%.2f\nAnnual Interest Rate: %.2f%%\nLoan Term: %d years\n" +
                             "Monthly Payment: ₹%.2f\nTotal Amount Paid: ₹%.2f",
                             principal, annualInterestRate, loanTerm, monthlyPayment, totalAmountPaid);
    }
}
