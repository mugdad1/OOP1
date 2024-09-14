package mugdad1;

public class TestShip {
    public static void main(String[] args) {
        // Create Ship objects
        Ship ship1 = new Ship("Ship1", 1.0, 0.0); // Moving East
        Ship ship2 = new Ship("Ship2", 2.0, 135.0); // Moving Northwest

        // Move the ships
        ship1.move();
        ship2.move();

        // Print the locations of the ships
        ship1.printLocation();
        ship2.printLocation();
    }
}
