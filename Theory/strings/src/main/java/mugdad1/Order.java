package mugdad1;

import java.util.ArrayList;

public class Order {
    // Private attribute
    private ArrayList<Article> list;

    // Constructor
    public Order() {
        list = new ArrayList<Article>();
    }

    // Methods
    public void add(Article article) {
        list.add(article);
    }

    public double calculateTotal() {
        double total = 0;
        for (Article a : list) {
            total = total + a.getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.printf("%n your Receipt %n");
        for (Article article : list) {
            System.out.println(article);
        }
        System.out.printf("%-26s SAR %6.2f%n", "Total", calculateTotal());
    }
}
