package mugdad1;

public class StudentsInformation {

    public static void main(String[] args) {
        // Create student instances
        Student st1 = new Student(101, "Ahmed", 4.5f);
        st1.displayInfo(); // Use camelCase for method names

        Student st2 = new Student(102, "Ahlam", 2.5f);
        st2.displayInfo();

        // Example of using setters
        st1.setStudentId(52); // Use camelCase for method names
        st1.setStudentName("Ali");
        st1.displayInfo();
    }
}
