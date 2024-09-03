
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeBook myGradeBook = new GradeBook("default");
        System.out.println("Enter course name: ");
        String nameofcourse = input.nextLine();
        System.out.println();
        myGradeBook.displayMessage(nameofcourse);
    }
}
        