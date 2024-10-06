package mugdad1;

import java.util.ArrayList;

/**
 * Manages a collection of articles in the shop.
 */
public class Catalog {
    private ArrayList<Article> list; // List to store articles

    // Constructor initializes the article list
    public Catalog() {
        list = new ArrayList<>();
    }

    // Adds an article to the catalog
    public void add(Article article) {
        list.add(article);
    }

    // Prints all articles in the catalog
    public void print() {
        System.out.println("The contents of the catalog:");
        for (Article a : list) {
            System.out.println(a);
        }
    }

    // Searches for an article by its number
    public Article search(int number) {
        for (Article article : list) {
            if (article.getNumber() == number) {
                return article; // Return the article if found
            }
        }
        System.out.println("Article Number: " + number + " is not in the catalog");
        return null; // Return null if not found
    }
}
