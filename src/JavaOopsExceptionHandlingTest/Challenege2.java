package JavaOopsExceptionHandlingTest;

// Main class
public class Challenege2 {

    // Student class to store student details
    class Student {

        // Instance variables to store student information
        String name;
        int rollNo;
        String section;

        // Constructor to initialize the student object
        Student(String name, int rollNo, String section) {
            this.name = name;          // Assigning name
            this.rollNo = rollNo;      // Assigning roll number
            this.section = section;    // Assigning section
        }

        // Method to display the student information in required format
        void display() {
            System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
        }
    }

    // main method
    public static void main(String[] args) {

        // Since Student is a non-static inner class, we need outer class object
        Challenege2 outer = new Challenege2();

        // Creating a student object
        Student s1 = outer.new Student("Bob", 101, "A");

        // Displaying the details of the student
        s1.display();
    }
}
