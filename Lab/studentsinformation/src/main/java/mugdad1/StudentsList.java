package mugdad1;


import java.util.ArrayList;

public class StudentsList {
    private ArrayList<Student> students;

    // Constructor to initialize the ArrayList
    public StudentsList() {
        students = new ArrayList<>();
    }

    // Method to add a Student object to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display information about all students
    public void displayStudentsInfo() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println(); // Add a line break for better readability
        }
    }
}
