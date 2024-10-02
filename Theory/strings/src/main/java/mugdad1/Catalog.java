package mugdad1;

import java.util.ArrayList;

public class Catalog {
    // Private attribute
    private ArrayList<Article> list;

    // Constructor
    public Catalog() {
        list = new ArrayList<Article>();
    }

    // Methods
    public void add(Article article) {
        list.add(article);
    }

    public void print() {
        System.out.println("The contents of the catalog :");
        for (Article a : list) {
            System.out.println(a);
        }
    }

    public Article search(int number) {
        Article lookedForArticle = null;
        for (Article article : list) {
            if (article.getNumber() == number) {
                lookedForArticle = article;
            }
        }
        if (lookedForArticle == null) {
            System.out.println(" Article Number: " + number + " is not in the catalog");
        }
        return lookedForArticle;
    }
}
