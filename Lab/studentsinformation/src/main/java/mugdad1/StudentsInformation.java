package mugdad1;

public class StudentsInformation {

    public static void main(String[] args) {
        // Create advisor instances
        Advisor ad1 = new Advisor(1, "Mugdad", "CS");
        Advisor ad2 = new Advisor(2, "Ali", "IT");
                // Create an array to hold references to 4 Student objects
        Student[] studentsArray = new Student[4];
         // Create student instances
        Student st1 = new Student(3, "Ahmed", 4.5f, ad2);
        Student st2 = new Student(4, "Ahlam", 3f, ad1);
        Student st3 = new Student(6, "df", 5f, ad2);
        // Assign the student references to the array
        studentsArray[0] = st1;
        studentsArray[1] = st2;
        studentsArray[2] = st3;

        // Display information for all students in the array
        System.out.println("Displaying students from the array:");
        for (Student student : studentsArray) {
            if (student != null) { // Check if the student is not null
                student.displayInfo();
                System.out.println(); // Add a line break for better readability
            } else {
                System.out.println("No student information available for this entry.");
            }
        }

        // Example of using setters
        st1.setStudentId(5); // Update student ID
        st1.setStudentName("Ali"); // Update student name
        st1.setStudentGPA(4);

        // Display updated information for the first student
        System.out.println("Updated Information for Student 1:");
        st1.displayInfo();

        // Create an instance of StudentsList (ArrayList)
        StudentsList studentsList = new StudentsList();
        
        // Add students to the ArrayList
        studentsList.addStudent(st1);
        studentsList.addStudent(st2);
        studentsList.addStudent(st3);

        // Display information for all students in the ArrayList
        System.out.println("\nDisplaying students from the ArrayList:");
        studentsList.displayStudentsInfo();
    }   
}
