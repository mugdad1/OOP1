package mugdad1;

/**
 * Main class to demonstrate catalog functionality.
 */
public class Main {
    public static void main(String[] args) {
        // Create a Catalog object
        Catalog catalog = new Catalog();
        
        // Add three Article objects to the Catalog
        catalog.add(new Article(1, "First Article",23));
        catalog.add(new Article(2, "Second Article",31));
        catalog.add(new Article(3, "Third Article",3));
        catalog.add(new Article(4, "fourth article",4));

        // Print the catalog contents
        System.out.println("The contents of the catalog:");
        catalog.print();

        // Search for an Article object with number 2
        Article foundArticle = catalog.search(4);

        // Check if the Article object was found and print its name
        if (foundArticle != null) {
            System.out.println("Found article: " + foundArticle.getName());
        } else {
            System.out.println("Article with number 2 not found.");
        }
    }
}
