package newpackage;

/**
 *
 * @author mugdad
 */
class Point {
    // Class fields
     private int x;
     private int y;

    // Default constructor
    Point() {
        x = 1;
        y = 2;
    }

    // Parameterized constructor
    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    // Getter for x
    int getX() {
        return x;
    }

    // Getter for y
    int getY() {
        return y;
    }

    // Setter for x
    void setX(int _x) {
        x = _x;
    }

    // Setter for y
    void setY(int _y) {
        y = _y;
    }
}

public class Lab4 {
    public static void main(String[] args) {
        Point p1 = new Point(4,2); // Create a new Point object + remove the parameter to use the defualt constructer
        System.out.println(p1.getX()); // Call getX() method
        System.out.println(p1.getY()); // Call getY() method
        p1.setX(10); // Set new value for x
        p1.setY(20); // Set new value for y
        System.out.println(p1.getX()); // Print updated x
        System.out.println(p1.getY()); // Print updated y
    }
}
