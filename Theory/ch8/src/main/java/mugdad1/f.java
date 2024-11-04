package mugdad1;

public class f {
    public static void testClassMethod() {
        System.out.println("The class method in Animal.");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal.");
    }
}

class Cat extends f {
    public static void testClassMethod() {
        System.out.println("The class method in Cat.");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        f myAnimal = myCat;
        f.testClassMethod(); // Calls the static method in Animal
        myAnimal.testInstanceMethod(); // Calls the instance method in Cat
    }
}
