package mugdad1;

import java.util.Scanner;

/**
 * Main class to demonstrate catalog functionality.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of articles to add to the catalog: ");
        int numArticles = scanner.nextInt();

        Catalog catalog = new Catalog();
        for (int i = 0; i < numArticles; i++) {
            System.out.print("Enter the name of article " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the price of article " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            catalog.add(new Article(name, price));
        }

        // Print the catalog
        catalog.print();

        // Create an order and add some articles to it
        Order order = new Order();
        System.out.print("Enter the number of articles to add to the order: ");
        int numOrderArticles = scanner.nextInt();
        for (int i = 0; i < numOrderArticles; i++) {
            System.out.print("Enter the number of the article to add to the order: ");
            int articleNumber = scanner.nextInt();
            Article article = catalog.search(articleNumber);
            if (article != null) {
                order.add(article);
            } else {
                System.out.println("Article not found in catalog.");
            }
        }

        // Print the order
        order.printReceipt();

        // Calculate the total price of the order
        double totalPrice = order.getTotalPrice();
        System.out.println("Total price of the order: " + totalPrice);

        scanner.close();
    }
}
