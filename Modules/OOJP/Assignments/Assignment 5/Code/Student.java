// Define the Student class
public class Student {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("Sumit Deshmukh", 22);

        // Print student details
        student.printStudentDetails();
    }
}
