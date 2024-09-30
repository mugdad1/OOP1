package mugdad1;
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
    }
}
