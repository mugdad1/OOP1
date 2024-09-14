package mugdad1;

// SpeedBoat class extending Ship class
public class SpeedBoat extends Ship {
    // Additional attribute for SpeedBoat
    private String type; // Type of speedboat

    // Constructor for SpeedBoat
    public SpeedBoat(String name, double speed, double direction, String type) {
        super(name, speed, direction); // Call the Ship constructor
        this.type = type;
    }

    // Overloaded constructor with default speed and direction
    public SpeedBoat(String name, String type) {
        this(name, 0.0, 0.0, type);
    }

    // Method to print the location of the speedboat
    @Override
    public void printLocation() {
        System.out.println(this.getName() + " (Type: " + this.type + ") is at (" + this.getX() + ", " + this.getY() + ").");
    }
}
