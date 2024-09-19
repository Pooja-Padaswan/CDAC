package Toll.com;



	public class TollBoothRevenueManager {
	    private double carRate;
	    private double truckRate;
	    private double motorcycleRate;
	    private int numCars;
	    private int numTrucks;
	    private int numMotorcycles;

	    // Constructor
	    public TollBoothRevenueManager(double carRate, double truckRate, double motorcycleRate) {
	        this.carRate = carRate;
	        this.truckRate = truckRate;
	        this.motorcycleRate = motorcycleRate;
	    }

	    // Getter methods
	    public double getCarRate() { return carRate; }
	    public double getTruckRate() { return truckRate; }
	    public double getMotorcycleRate() { return motorcycleRate; }
	    public int getNumCars() { return numCars; }
	    public int getNumTrucks() { return numTrucks; }
	    public int getNumMotorcycles() { return numMotorcycles; }

	    // Setter methods
	    public void setCarRate(double carRate) { this.carRate = carRate; }
	    public void setTruckRate(double truckRate) { this.truckRate = truckRate; }
	    public void setMotorcycleRate(double motorcycleRate) { this.motorcycleRate = motorcycleRate; }
	    public void setNumCars(int numCars) { this.numCars = numCars; }
	    public void setNumTrucks(int numTrucks) { this.numTrucks = numTrucks; }
	    public void setNumMotorcycles(int numMotorcycles) { this.numMotorcycles = numMotorcycles; }

	    // Calculate total revenue
	    public double calculateTotalRevenue() {
	        return (numCars * carRate) + (numTrucks * truckRate) + (numMotorcycles * motorcycleRate);
	    }

	    // Calculate total number of vehicles
	    public int calculateTotalVehicles() {
	        return numCars + numTrucks + numMotorcycles;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return String.format("Total Vehicles: %d\nTotal Revenue: ₹%.2f",
	                             calculateTotalVehicles(), calculateTotalRevenue());
	    }
	}

