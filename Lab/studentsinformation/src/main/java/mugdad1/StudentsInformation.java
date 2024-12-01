package mugdad1;

public class StudentsInformation {

    public static void main(String[] args) {
        // Create student instances
        Advisor ad1 = new Advisor(1 , "mugdad ", "cs ");
        Advisor ad2 = new Advisor(2 , "ali ", "it ");
        //System.out.println(ad1.toString());
        //System.out.println(ad2.toString());
    
        Student st1 = new Student(3 , "Ahmed ", 4.5f,ad2);    
        Student st2 = new Student(4 , "Ahlam ", 3f,ad1);
        st1.displayInfo(); // Display information for the first student
        System.out.println(); // Add a line break for better readability

        st2.displayInfo(); // Display information for the second student
        System.out.println(); // Add a line break for better readability
        ad1.displayInfoadv();
        System.out.println(); // Add a line break for better readability

    

        // Example of using setters
        st1.setStudentId(5); // Update student ID
        st1.setStudentName("Ali"); // Update student name
        st1.setStudentGPA(4);
        st1.displayInfo(); // Display updated information for the first student
    }
}
