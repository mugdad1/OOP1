// Define a class to represent a grade book for a school subject
public class GradeBook {

    // Declare a private field to store the name of the school subject
    private String courseName;

    // Define a constructor to initialize the course name
    public GradeBook(String courseName) {
        // Set the course name using the constructor parameter + this. is used to make the string is excact
        this.courseName = courseName;
    }

    // Define a method to display a welcome message using the course name
    public void displayMessage() {
        // Print a welcome message with the course name
        System.out.println("Welcome to the "+ courseName + " GradeBook!");//%s add
    }

    // Define a setter method to change the course name
    public void setCourseName(String name) {
        courseName = name;
    }

    // Define a getter method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }

    // Define a method to calculate the product of two integers
    public int x() {
        int e = 2;
        int w = 4;
        int z = e * w;
        return z;
    }
}
/*
 * 
    Keep methods short and focused: Keep methods short and focused on a single task. A method should ideally be no longer than a single screen to make it easier to read and understand.
    Keep classes small and focused: Keep classes small and focused on a single responsibility. A class should ideally have a single responsibility and be no longer than a few screens to make it easier to read and understand.
    Use comments to explain complex code: Use comments to explain complex or non-obvious code. Comments should be used sparingly and only when necessary.
    Use white space to improve readability: Use white space to improve the readability of your code. Use blank lines to separate logical sections of code and indent code blocks to make the structure clear.
    Avoid hard-coding values: Avoid hard-coding values in your code. Instead, use constants or configuration files to make your code more flexible and maintainable.
    Use exception handling to handle errors: Use exception handling to handle errors and exceptions in your code. This makes your code more robust and easier to debug.
    Use access modifiers appropriately: Use access modifiers appropriately to control the visibility and accessibility of your classes, methods, and variables.
    Use encapsulation to hide implementation details: Use encapsulation to hide implementation details and provide a simple interface for users of your class.
    Follow the Java coding standards and best practices: Follow the Java coding standards and best practices to ensure that your code is maintainable, scalable, and easy to understand. This includes using design patterns, following the Java API documentation, and using the latest Java features and libraries.
    Keep the size of your code minimal: Keep the size of your code minimal by avoiding unnecessary code, comments, and blank lines. This makes your code easier to read, understand, and maintain.

 */