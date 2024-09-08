
// Define a class to test the GradeBook class
import java.util.Scanner;

public class GradeBookTest {

    // Define the main method to run the program
    public static void main(String[] args) {

        // Create a new Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);
        // Create a new GradeBook object with a default course name
        GradeBook myGradeBook = new GradeBook("default");

        // Prompt the user to enter a course name
        System.out.println("Enter course name: ");

        // Read the user's input and store it in a variable
        String nameofcourse = input.nextLine();

        // Display a blank line
        System.out.println();

        // Call the displayMessage method with the provided course name
        myGradeBook.displayMessage(nameofcourse);

        // Close the Scanner object to release system resources
        input.close();
    }
}
