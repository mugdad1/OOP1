package mugdad1;

public class Student {

    private int studentId; // Use camelCase for variable names
    private String studentName;
    private float studentGPA; // You can keep this as float if you prefer

    // Constructor
    Student(int studentId, String studentName, float studentGPA) {
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
            this.studentGPA = 0; // Set a default value
        }
    }

    public void setStudentName(String studentName) {
        if (studentName != null && !studentName.trim().isEmpty()) {
            this.studentName = studentName;
        } else {
            System.out.println("Invalid name. It cannot be null or empty.");
        }
    }

    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid ID. It must be greater than 0.");
        }
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
