package studentsinformation;

/**
 *
 * @author mugdad
 */
public class Student {

    private int StudentID;
    private String StudentName;
    private float StudentGPA;

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
