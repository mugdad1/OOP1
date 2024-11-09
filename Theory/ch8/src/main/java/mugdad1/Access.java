package mugdad1;
class Access {
     static int x;

    void increment() {
        x++;
    }
}

class StaticUse {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Access obj1 = new Access();
        Access obj2 = new Access();
        Access obj3 = new Access();


        obj1.x = 0; // Initialize x to 0
        obj1.increment(); // Increment x using obj1
        obj2.increment(); // Increment x using obj2
        obj3.increment();

        System.out.println(obj1.x + " " + obj2.x + " " + obj3.x); // Print the value of x from both objects
    }
}
