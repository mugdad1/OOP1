package mugdad1;

// Define a class to test the GradeBook class
import java.util.Scanner;

public class GradeBookTest {

    // Define the main method to run the program
    public static void main(String[] args) {

        // Create a new Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a course name
        System.out.print("Enter course name: ");
        String courseName = input.nextLine();

        // Prompt the user to enter a course number
        System.out.print("Enter course number: ");
        int courseNumber = input.nextInt();

        // Create a new GradeBook object with the user-entered course name and number
        GradeBook myGradeBook = new GradeBook(courseName, courseNumber);

        // Display a blank line
        System.out.println();

        // Call the displayMessage method to show the course details
        myGradeBook.displayMessage();

        // Update the course name
        myGradeBook.setCourseName("Introduction to Java");

        // Retrieve the updated course name and number
        String updatedCourseName = myGradeBook.getCourseName();
        int updatedCourseNumber = myGradeBook.getCourseNumber();

        // Print the updated course details to the console
        System.out.println("Updated course name: " + updatedCourseName);
        System.out.println("Updated course number: " + updatedCourseNumber);

        // Create additional GradeBook objects for testing
        GradeBook gradeBook1 = new GradeBook("CS101", 101);
        System.out.println("Grade Book 1: " + gradeBook1.getCourseName() + ", Course Number: " + gradeBook1.getCourseNumber());

        GradeBook gradeBook2 = new GradeBook("CS102", 102);
        System.out.println("Grade Book 2: " + gradeBook2.getCourseName() + ", Course Number: " + gradeBook2.getCourseNumber());

        // Close the Scanner object to release system resources
        input.close();
    }
}
