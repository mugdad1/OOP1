package mugdad1;

public class Lab4 {

    public static void main(String[] args) {
        // Create a new Point object using the parameterized constructor
        Point point = new Point(4, 2);

        // Print initial coordinates
        System.out.println("Initial X: " + point.getX()); // Call getX() method
        System.out.println("Initial Y: " + point.getY()); // Call getY() method

        // Set new values for x and y
        point.setX(10);
        point.setY(20);

        // Print updated coordinates
        System.out.println("Updated X: " + point.getX()); // Print updated x
        System.out.println("Updated Y: " + point.getY()); // Print updated y
    }
}

class Point {

    // Class fields
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this(1, 2);
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }
}
