/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mugdad1;

/**
 *
 *@author mugdad
*/
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(); // Create an instance of Cat
        Animal myAnimal = myCat; // Upcasting to Animal reference

        // Call the static method from the Animal class
        Animal.testClassMethod(); // Calls Animal's static method

        // Call the instance method from the Cat class
        myAnimal.testInstanceMethod(); // Calls Cat's overridden instance method
    }
}

