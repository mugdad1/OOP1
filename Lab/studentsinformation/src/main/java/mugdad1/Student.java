package mugdad1;

public class Student {

    private int StudentID;
    private String StudentName;
    public float StudentGPA;

    public void setStudentGPA(float studentGPA) {
        this.StudentGPA = studentGPA;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.StudentID = studentID;
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
        if (StudentGPA >= 0 && StudentGPA<=5){
            this.StudentGPA = StudentGPA;

            

        }else
        System.out.println(" wrong gpa ");
        this.StudentName = StudentName;

    }

    void DisplayInfo() {
        System.out.println("std id:" + StudentID);
        System.out.println("std name:" + StudentName);
        System.out.println("std GPA:" + StudentGPA);
    }

}
