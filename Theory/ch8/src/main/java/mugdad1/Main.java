package mugdad1;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // Using the add method with two parameters
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1); // Output: 15
        
        // Using the add method with three parameters
        int sum2 = calculator.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum2); // Output: 30
        Animal myHorse = new Horse();
        Animal myLion = new Lion();
        Animal myAnimal = new Animal();

        myAnimal.eat();
        myHorse.eat(); // Output: plants
        myLion.eat();  // Output: meet
    }

}
