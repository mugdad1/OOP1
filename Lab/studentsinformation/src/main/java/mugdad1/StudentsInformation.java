package mugdad1;

public class StudentsInformation {

    public static void main(String[] args) {

        Student st1 = new Student(101, "ahmed ", 45f);
        st1.DisplayInfo();

        Student st2 = new Student(101, "ahlam ", (float) 2.5f);
        st2.DisplayInfo();

        /*st1.setStudentID(52);// we modifed the student id using setters and getters
        st1.setStudentGPA(7.5f);
        st2.setStudentName("null");
*/

    }

}
