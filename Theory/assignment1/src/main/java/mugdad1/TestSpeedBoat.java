package mugdad1;

public class TestSpeedBoat {
    public static void main(String[] args) {
        // Create SpeedBoat objects
        SpeedBoat speedBoat1 = new SpeedBoat("SpeedBoat1", 3.0, 45.0, "Racing");
        SpeedBoat speedBoat2 = new SpeedBoat("SpeedBoat2", 4.0, 90.0, "Leisure");

        // Move the speedboats
        speedBoat1.move();
        speedBoat2.move();

        // Print the locations of the speedboats
        speedBoat1.printLocation();
        speedBoat2.printLocation();
    }
}
