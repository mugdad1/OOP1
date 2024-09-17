package mugdad1;

public class StudentsInformation {

    public static void main(String[] args) {
        // Create student instances
        Student st1 = new Student(101, "Ahmed", 4.5f);
        st1.DisplayInfo();

        Student st2 = new Student(102, "Ahlam", 2.5f);
        st2.DisplayInfo();

        // Example of using setters
        st1.setStudentID(52);
        st1.setStudentGPA(34f);
        st1.setStudentName("Ali");
        st1.DisplayInfo();
    }
}
