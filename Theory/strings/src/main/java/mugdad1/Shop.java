package mugdad1;

/**
 * Main class to run the shop application.
 */
public class Shop {
    public static void main(String[] args) {
        // Create articles
        Article art1 = new Article(40, "Samsung Galaxy 55", 2229.95);
        Article art2 = new Article(1, "Another Article", 100.0);

        // Create a catalog and add articles
        Catalog catalog = new Catalog();
        catalog.add(art1);
        catalog.add(art2);
        System.out.println(art1); // Print details of the first article
        catalog.print(); // Print the catalog contents

        // Create an order and add articles to it
        Order order = new Order();
        order.add(catalog.search(40)); // Add article with number 40
        order.add(catalog.search(1));   // Add article with number 1
        order.printReceipt(); // Print the order receipt
    }
}
