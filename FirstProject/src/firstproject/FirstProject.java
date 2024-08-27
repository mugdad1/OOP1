package firstproject;

/**
 *
 * @author mugdad
 */
 class FirstProject {//class name and file.jaVA must be equal||i can remove the public in the begging 

    public static void main(String[] args) {
//main method follows main class| java is case sensetive| string is a class |
        System.out.println("HELLO WORLD");
        System.out.printf("%15s","fk"+"\n");
//      جملة الطباعة تتبع كلاس السستمsystem.out

    }

}
/*
Escape Sequences in Java:
\n  - New line
\t  - Tab
\\  - Backslash
\'  - Single quote
\"  - Double quote
\r  - Carriage return
\b  - Backspace
\f  - Form feed
*/
/*
Main Format Specifiers for printf in Java:
%d  - Decimal integer
%f  - Floating-point number
%s  - String
%c  - Character
%b  - Boolean
%n  - New line (platform-independent)
*/
import java.util.Scanner; // program uses class Scanner
public class Addition
{
// main method begins execution of Java application public static void main(String[] args)
{
// create a Scanner to obtain input from the command window Scanner input = new Scanner(System.in);
int number1; // first number to add int number2; // second number to add


int sum; // sum of number1 and number2

Imports class Scanner for use in this program
Creates Scanner for
reading data from the
user
Variables that are declared but not initialized

System.out.print("Enter first integer: "); // prompt number1 = input.nextInt(); // read first number from user
System.out.print("Enter second integer: "); // prompt number2= input.nextInt(); // read second number from user
sum = number1 + number2; // add numbers, then store total in sum