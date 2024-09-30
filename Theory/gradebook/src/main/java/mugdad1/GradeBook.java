package mugdad1;

// Define a class to represent a grade book for a school subject
public class GradeBook {

    public GradeBook() {
    }

    // Declare private fields to store the name and number of the school subject
    private String courseName;
    private int courseNumber;

    // Define a constructor to initialize both course name and number
    GradeBook(String courseName, int courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    // Define a method to display a welcome message using the course name and number
    public void displayMessage() {
        // Check if course name is set before printing
        if (courseName != null && !courseName.isEmpty()) {
            System.out.println("Welcome to the " + courseName + " GradeBook!");
        } else {
            System.out.println("Welcome to the GradeBook!");
        }

        System.out.println("The course number is " + courseNumber);
    }

    // Define a setter method to change the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName; // Use 'this' to clarify that it's the instance variable
    }

    // Define a setter method to change the course number
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber; // Use 'this' to clarify that it's the instance variable
    }

    // Define a getter method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }

    // Define a getter method to retrieve the course number
    public int getCourseNumber() {
        return courseNumber;
    }
}
