package mugdad1;

public class Student {

    private int StudentID;
    private String StudentName;
    private float StudentGPA;

    public void setStudentGPA(float studentGPA) {
        StudentGPA = studentGPA;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public float getStudentGPA() {
        return StudentGPA;
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    Student(int StudentID, String StudentName, float StudentGPA) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentGPA = StudentGPA;

    }

    void DisplayInfo() {
        System.out.println("std id:" + StudentID);
        System.out.println("std name:" + StudentName);
        System.out.println("std GPA:" + StudentGPA);
    }

}
