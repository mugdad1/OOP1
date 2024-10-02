package mugdad1;

public class Shop {
    public static void main(String[] args) {
        Article art1 = new Article(40, "Samsung Galaxy 55", 2229.95);
        Article art2 = new Article(1, "Another Article", 100.0);

        Catalog catalog = new Catalog();
        catalog.add(art1);
        catalog.add(art2);
        System.out.println(art1);
        catalog.print();

        Order order = new Order();
        order.add(catalog.search(40));
        order.add(catalog.search(1));
        order.printReceipt();
    }
}
