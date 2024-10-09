package mugdad1;


import java.util.Scanner;

/**
 * Main class to run the shop application.
 */
public class Shop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create articles
        System.out.print("Enter the number of the first article: ");
        int art1Number = scanner.nextInt();
        System.out.print("Enter the name of the first article: ");
        scanner.nextLine(); // Consume the newline character
        String art1Name = scanner.nextLine();
        System.out.print("Enter the price of the first article: ");
        double art1Price = scanner.nextDouble();
        Article art1 = new Article(art1Name, art1Price);

        System.out.print("Enter the number of the second article: ");
        int art2Number = scanner.nextInt();
        System.out.print("Enter the name of the second article: ");
        scanner.nextLine(); // Consume the newline character
        String art2Name = scanner.nextLine();
        System.out.print("Enter the price of the second article: ");
        double art2Price = scanner.nextDouble();
        Article art2 = new Article(art2Name, art2Price);

        // Create a catalog and add articles
        Catalog catalog = new Catalog();
        catalog.add(art1);
        catalog.add(art2);
        System.out.println(art1); // Print details of the first article
        catalog.print(); // Print the catalog contents

        // Create an order and add articles to it
        Order order = new Order();
        order.add(catalog.search(art1Number)); // Add article with number art1Number
        order.add(catalog.search(art2Number));   // Add article with number art2Number
        order.printReceipt(); // Print the order receipt

        scanner.close();
    }
}