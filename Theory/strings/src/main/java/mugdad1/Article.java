package mugdad1;

public class Article {
    private int number;
    private String name;
    private double price;

    public Article(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public Article(int number, String name) {
        this(number, name, 0.0);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
