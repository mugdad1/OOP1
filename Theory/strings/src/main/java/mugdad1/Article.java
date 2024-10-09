package mugdad1;

/**
 * Represents an article in the shop with a number, name, and price.
 */
public class Article {
    private static int nextNumber = 1; // Next available article number
    private int number; // Unique identifier for the article
    private String name; // Name of the article
    private double price; // Price of the article

    // Constructor initializes the article attributes
    public Article(String name, double price) {
        this.name = name;
        this.price = price;
        this.number = nextNumber++;
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

    // Setters for article attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
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

    // Calculates the total price of the article, including any taxes or discounts
    public double getTotalPrice(double taxRate, double discount) {
        return price * (1 + taxRate) - discount;
    }
}
