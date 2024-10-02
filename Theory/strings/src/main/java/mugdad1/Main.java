package mugdad1;
/* 
public class Main {

    public static void main(String[] args) {
        // Declare and initialize a string variable
        String s = "nora";

        // Declare and initialize another string variable
        String name = "Abdullah";

        // Print the first character of the 'name' string
        System.out.println(name.charAt(0)); // Output: A

        // Concatenate two strings using the 'concat()' method
        s = s.concat(" mohammed");
        System.out.println(s); // Output: nora mohammed

        // Declare a constant for the array length
        final int ARRAY_LENGTH = 10;

        // Declare and initialize an integer array with the constant length
        int[] array = new int[ARRAY_LENGTH];

        // Populate the array with values using a for loop
        for (int counter = 0; counter < array.length; counter++) {
            // The formula 2 + 2 * counter generates a sequence of numbers: 2, 4, 6, 8, 10, ...
            array[counter] = 2 + 2 * counter;
        }

        // Print a header for the table
        System.out.printf("%s%8s\n", "Index", "Value");

        // Print the array elements in a formatted table
        for (int counter = 0; counter < array.length; counter++) {
            // Use the 'printf()' method to print each element with a fixed-width format
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }

        // Create an integer array with 6 elements
        int[] intArray = {1, 2, 3, 4, 5, 6};

        // Create a new integer array with the same length as the original array
        int[] intArrayCopy = new int[intArray.length];

        // Use the System.arraycopy() method to copy the contents of the original array to the new array
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);

        // Print out the contents of the original array
        for (int a : intArray) {
            System.out.println(a);
        }
        System.out.println(" "); // Print a blank line

        // Print out the contents of the copied array
        for (int a : intArrayCopy) {
            System.out.println(a);
        }

        // Demonstrate the overloaded add methods
        MathOperations mathOps = new MathOperations();
        System.out.println("Sum of two integers: " + mathOps.add(5, 10)); // Output: 15
        System.out.println("Sum of three integers: " + mathOps.add(5, 10, 15)); // Output: 30
        System.out.println("Sum of two doubles: " + mathOps.add(5.5, 10.5)); // Output: 16.0
    }
}

class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}
*/


public class Main {
    public static void main(String[] args) {
        // Create a Catalog object
        Catalog catalog = new Catalog();
        // Add three Article objects to the Catalog
        catalog.add(new Article(1, "First Article"));
        catalog.add(new Article(2, "Second Article"));
        catalog.add(new Article(3, "Third Article"));

        // Print the catalog
        System.out.println("The contents of the catalog :");
        catalog.print();

        // Search for an Article object with number 2
        Article foundArticle = catalog.search(2);

        // Check if the Article object was found and print its name
        if (foundArticle != null) {
            System.out.println("Found article: " + foundArticle.getName());
        }
    }
}
