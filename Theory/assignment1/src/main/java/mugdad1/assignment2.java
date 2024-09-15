package mugdad1;

import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to convert to uppercase:");
        String str = scanner.nextLine();
        String uppercaseStr = convertToUppercase(str);
        scanner.close();
        System.out.println(uppercaseStr); // Output will depend on user input
    }

    public static String convertToUppercase(String inputString) {
        return inputString.toUpperCase();
    }
}

