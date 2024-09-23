package Assignment_06;

	import java.util.Scanner;

	class StudentRecords {
	    private String[] records; 

	 
	    public StudentRecords(int size) {
	        records = new String[size]; // Create the array
	    }


	    public void acceptRecord() {
	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < records.length; i++) {
	            System.out.print("Enter name of student " + (i + 1) + ": ");
	            records[i] = sc.nextLine(); // Store the name
	        }
	    }

	    public void printRecord() {
	        System.out.println("Student Records:");
	        for (String record : records) {
	            System.out.println(record); // Print each student name
	        }
	    }
	}

	public class StudentRec {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = sc.nextInt();
	        sc.nextLine(); // Consume newline

	   
	        StudentRecords studentRecords = new StudentRecords(numberOfStudents);
	  
	        studentRecords.acceptRecord();
	        studentRecords.printRecord();
	    }
	}
