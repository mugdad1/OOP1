package mugdad1;

public abstract class Person {
    private int id; // Changed to lowercase for consistency
    private String name; // Changed to lowercase for consistency

    // Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    abstract void display(); // Changed to lowercase for consistency
}
