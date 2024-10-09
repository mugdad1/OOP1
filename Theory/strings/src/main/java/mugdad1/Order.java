package mugdad1;
import java.util.ArrayList;

/**
 * Represents an order containing articles selected by the user.
 */
public class Order {
    private ArrayList<Article> articles; // List to store articles in the order

    // Constructor initializes the order
    public Order() {
        articles = new ArrayList<>();
    }

    // Adds an article to the order
    public void add(Article article) {
        if (article == null) {
            throw new IllegalArgumentException("Cannot add a null article to the order.");
        }
        if (articles.contains(article)) {
            throw new IllegalArgumentException("Cannot add the same article to the order more than once.");
        }
        articles.add(article);
    }

    // Removes an article from the order
    public void remove(Article article) {
        if (article == null) {
            throw new IllegalArgumentException("Cannot remove a null article from the order.");
        }
        articles.remove(article);
    }

    // Prints the receipt of the order
    public void printReceipt() {
        System.out.println("Receipt:");
        if (articles.isEmpty()) {
            System.out.println("No articles in the order."); // Handle empty order
            return;
        }
        for (Article article : articles) {
            System.out.println(article); // Print each article in the order
        }
    }

    // Calculates the total price of the order
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Article article : articles) {
            totalPrice += article.getPrice();
        }
        return totalPrice;
    }
}
