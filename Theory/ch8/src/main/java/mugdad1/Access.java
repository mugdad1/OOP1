package mugdad1;
class Access {
    static int x;

    void increment() {
        x++;
    }
}

class StaticUse {
    public static void main(String[] args) {
        Access obj1 = new Access();
        Access obj2 = new Access();

        obj1.x = 0; // Initialize x to 0
        obj1.increment(); // Increment x using obj1
        obj2.increment(); // Increment x using obj2

        System.out.println(obj1.x + " " + obj2.x); // Print the value of x from both objects
    }
}
