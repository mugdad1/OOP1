
// Define a class to test the GradeBook class
import java.util.Scanner;

public class GradeBookTest {

    // Define the main method to run the program
    public static void main(String[] args) {

        // Create a new Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a course name
        System.out.println("Enter course name: ");

    
        // Read the user's input and store it in a variable
        String nameofcourse = input.nextLine();

        // Create a new GradeBook object with the user-entered course name
        GradeBook myGradeBook = new GradeBook(nameofcourse);

        // Display a blank line
        System.out.println();

        // Call the displayMessage method with the provided course name
        myGradeBook.displayMessage();

        // Call the setCourseName method to change the course name
        myGradeBook.setCourseName("intro to java");

        // Retrieve the updated course name
        String courseName = myGradeBook.getCourseName();

        // Print the updated course name to the console
        System.out.println("The course name is: " + courseName);

        GradeBook gradeBook1 = new GradeBook("cs101");
        System.out.println("grade book 1 "+gradeBook1.getCourseName());
        GradeBook gradeBook2 = new GradeBook("cs102");
        System.out.println("grade book 2 "+gradeBook2.getCourseName());
 
        // Attempt to call the non-existent x method
        int z = myGradeBook.x();

        // Print the result of the non-existent x method
        System.out.println(z);

        // Close the Scanner object to release system resources
        input.close();
    }
}

/*
 * consturcter is used to create an obj
 * Each class can provide a constructor that initializes an object of a class when the object is created. 
 * constructer must be same as a
 * methods can return value but not constructer
 * GradeBook
 */