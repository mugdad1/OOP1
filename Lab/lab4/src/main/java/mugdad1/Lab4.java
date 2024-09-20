package mugdad1;

public class Lab4 {
    public static void main(String[] args) {
        // Create a new Point object using the parameterized constructor
        Point p1 = new Point(4, 2);
        
        // Print initial coordinates
        System.out.println("Initial X: " + p1.getX()); // Call getX() method
        System.out.println("Initial Y: " + p1.getY()); // Call getY() method
        
        // Set new values for x and y
        p1.setX(10);
        p1.setY(20);
        
        // Print updated coordinates
        System.out.println("Updated X: " + p1.getX()); // Print updated x
        System.out.println("Updated Y: " + p1.getY()); // Print updated y
    }
}

class Point {
    // Class fields
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 1;
        this.y = 2;
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
