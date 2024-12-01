package mugdad1;

import java.util.ArrayList;

public class StudentsList {
    private ArrayList<Student> studentsList;

    // Constructor
    public StudentsList() {
        studentsList = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        studentsList.add(student);
    }

    // Method to display all students
    public void displayStudents() {
        for (Student s : studentsList) {
            s.display(); // Call the display method from the Student class
        }
    }

    // Method to search for a student by ID
    public Student search(int id) {
        for (Student s : studentsList) {
            if (s.getId() == id) {
                return s; // Return the found student
            }
        }
        return null; // Return null if not found
    }

    // Method to search for a student by name
    public Student search(String name) {
        for (Student s : studentsList) {
            if (s.getName().equals(name)) {
                return s; // Return the found student
            }
        }
        return null; // Return null if not found
    }
}
