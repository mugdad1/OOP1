package mugdad1;

public class Student {

    private int studentId; // Use camelCase for variable names
    private String studentName;
    private float studentGPA;

    // Constructor
    public Student(int studentId, String studentName, float studentGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        setStudentGPA(studentGPA); // Use setter to validate GPA
    }

    // Setters
    public void setStudentGPA(float studentGPA) {
        if (studentGPA >= 0 && studentGPA <= 5) {
            this.studentGPA = studentGPA;
        } else {
            System.out.println("Invalid GPA. It must be between 0 and 5.");
            this.studentGPA = 0; // Set a default value or handle it as needed
        }
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getters
    public float getStudentGPA() {
        return studentGPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student GPA: " + studentGPA);
    }
}
