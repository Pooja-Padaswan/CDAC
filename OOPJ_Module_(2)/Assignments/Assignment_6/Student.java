package Assignment_06;

class Student {
    private String name;
    private int age;
    private String rollNumber;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }


    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setter methods
        student.setName("Pooja Padaswan");
        student.setAge(23);
        student.setRollNumber("047");

        // Retrieving and printing values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}

