package mugdad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word you want to convert to captial");
        String str = scanner.nextLine();
        String uppercaseStr = convertToUppercase(str);
        scanner.close();
        System.out.println(uppercaseStr); // Output: "JJJ"
    }

    public static String convertToUppercase(String inputString) {
        return inputString.toUpperCase();
    }
}
