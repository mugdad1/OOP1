package mugdad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Try-with-resources for automatic closing
            // Input for division
            System.out.print("Enter first number (n1): ");
            int n1 = scanner.nextInt();
            System.out.print("Enter second number (n2): ");
            int n2 = scanner.nextInt();

            // Check for division by zero
            if (n2 == 0) {
                System.out.println("Error: Division by zero.");
            } else {
                System.out.println("Result: " + (n1 / n2));
            }

            System.out.println("bye bye");

            // Create and display students
            Student s1 = new Student(2, "ali", 3.5f);
            s1.display(); // Changed to lowercase
            Student s2 = new Student(1, "moh", 4.5f);
            s2.display(); // Changed to lowercase

            // Create a StudentsList instance
            StudentsList sList = new StudentsList();
            sList.addStudent(s1);
            sList.addStudent(s2);

            // Search for a student by ID
            System.out.print("Enter ID to search: ");
            int id = scanner.nextInt();
            Student target = sList.search(id);
            if (target == null) {
                System.out.println("Student not found.");
            } else {
                target.display(); // Changed to lowercase
            }

            // Search for a student by name
            System.out.print("Enter name to search: ");
            String name = scanner.next();
            target = sList.search(name);
            if (target == null) {
                System.out.println("Student not found.");
            } else {
                target.display(); // Changed to lowercase
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
