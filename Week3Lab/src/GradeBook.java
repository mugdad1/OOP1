// Define a class to represent a grade book for a school subject
public class GradeBook {

    // Declare a private field to store the name of the school subject
    private String courseName;

    // Define a constructor to initialize the course name
    public GradeBook(String courseName) {
        // Set the course name using the constructor parameter
        this.courseName = courseName;
    }

    // Define a method to display a welcome message using the course name
    public void displayMessage() {
        // Print a welcome message with the course name
        System.out.println("Welcome to the " + courseName + " GradeBook!");
    }

    // Define an overloaded method to display a welcome message using a provided course name
    public void displayMessage(String courseName) {
        // Print a welcome message with the provided course name
        System.out.println("Welcome to the " + courseName + " GradeBook!");
    }
}
