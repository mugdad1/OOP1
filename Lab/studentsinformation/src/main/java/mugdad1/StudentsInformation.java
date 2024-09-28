package mugdad1;

public class StudentsInformation {

    public static void main(String[] args) {
        // Create student instances
        Student st1 = new Student(101, "Ahmed", 4.5f);
        st1.displayInfo(); // Display information for the first student
        System.out.println(); // Add a line break for better readability

        Student st2 = new Student(102, "Ahlam", 2.5f);
        st2.displayInfo(); // Display information for the second student
        System.out.println(); // Add a line break for better readability

        // Example of using setters
        st1.setStudentId(52); // Update student ID
        st1.setStudentName("Ali"); // Update student name
        st1.displayInfo(); // Display updated information for the first student
    }
}
