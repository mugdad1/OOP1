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
        if (article != null) {
            articles.add(article); // Add article if it's not null
        } else {
            System.out.println("Cannot add a null article to the order.");
        }
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
}
