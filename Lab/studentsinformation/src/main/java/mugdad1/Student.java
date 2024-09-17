package mugdad1;

public class Student {

    private int StudentID;
    private String StudentName;
    private float StudentGPA;

    // Constructor
    public Student(int StudentID, String StudentName, float StudentGPA) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        setStudentGPA(StudentGPA); // Use setter to validate GPA
    }

    // Setters
    public void setStudentGPA(float studentGPA) {
        if (studentGPA >= 0 && studentGPA <= 5) {
            this.StudentGPA = studentGPA;
        } else {
            System.out.println("Invalid GPA. It must be between 0 and 5.");
            this.StudentGPA = 0; // Set a default value or handle it as needed
        }
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.StudentID = studentID;
    }

    // Getters
    public float getStudentGPA() {
        return StudentGPA;
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    // Method to display student information
    public void DisplayInfo() {
        System.out.println("Student ID: " + StudentID);
        System.out.println("Student Name: " + StudentName);
        System.out.println("Student GPA: " + StudentGPA);
    }
}
