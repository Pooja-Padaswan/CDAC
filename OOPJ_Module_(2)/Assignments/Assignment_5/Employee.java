package Assign_5;
class Employee {
    // Static field to keep track of the number of instances created.
    private static int instanceCount = 0;

    // Non-static field to store a unique name for each instance.
    private String employeeName;

    // Constructor that increments the instanceCount each time an object is created.
    public Employee(String employeeName) {
        this.employeeName = employeeName;
        instanceCount++; // Increment the static instance count.
    }

    // Static method to return the current count of instances created.
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Getter for the employee name (non-static field).
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for the employee name (non-static field).
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Overriding the toString method to display employee details.
    @Override
    public String toString() {
        return "Employee Name: " + employeeName;
    }

    public static void main(String[] args) {
        // Create instances of Employee.
        Employee emp1 = new Employee("Alice Johnson");
        Employee emp2 = new Employee("Bob Smith");
        Employee emp3 = new Employee("Charlie Brown");

        // Print the number of instances created so far (using the static method).
        System.out.println("Total instances created: " + Employee.getInstanceCount());

        // Access non-static field via getter and print details.
        System.out.println("Details of emp1: " + emp1.getEmployeeName());
        System.out.println("Details of emp2: " + emp2.toString());

        // Update employee name and show updated information.
        emp1.setEmployeeName("Alice Cooper");
        System.out.println("Updated details of emp1: " + emp1.toString());
    }
}
