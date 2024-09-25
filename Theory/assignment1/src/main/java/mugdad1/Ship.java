package mugdad1;

// Ship class representing a ship with properties and methods
public class Ship {
    // Private attributes
    private double x; // X-coordinate
    private double y; // Y-coordinate
    private double speed; // Speed of the ship
    private double direction; // Direction in degrees
    private String name; // Name of the ship

    // Constructor with parameters
    public Ship(String name, double speed, double direction) {
        this.name = name;
        this.speed = speed;
        this.direction = direction;
        this.x = 0.0; // Initial position
        this.y = 0.0; // Initial position
    }

    // Overloaded constructor with default speed and direction
    public Ship(String name) {
        this(name, 0.0, 0.0);
    }

    // Method to convert degrees to radians
    public double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180.0;
    }

    // Method to move the ship based on speed and direction
    public void move() {
        this.x += this.speed * Math.cos(degreesToRadians(this.direction));
        this.y += this.speed * Math.sin(degreesToRadians(this.direction));
    }

    // Overloaded move method to move the ship with a new speed
    public void move(double newSpeed) {
        this.speed = newSpeed;
        move(); // Call the original move method
    }

    // Method to print the current location of the ship
    public void printLocation() {
        System.out.println(this.name + " is at (" + this.x + ", " + this.y + ").");
    }

    // Getter and slintetter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }
}
