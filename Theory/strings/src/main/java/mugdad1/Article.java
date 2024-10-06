package mugdad1;

/**
 * Represents an article in the shop with a number, name, and price.
 */
public class Article {
    private int number; // Unique identifier for the article
    private String name; // Name of the article
    private double price; // Price of the article

    // Constructor with all attributes
    public Article(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    // Constructor with default price
    public Article(int number, String name) {
        this(number, name, 0.0);
    }

    // Getters for article attributes
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // String representation of the article
    @Override
    public String toString() {
        return "Article{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
