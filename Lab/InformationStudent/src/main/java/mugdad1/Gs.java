package mugdad1;

public class Gs extends Student {
    private String thesisTitle; // Changed to a more descriptive name

    // Constructor for Gs with ID, Name, and Thesis Title
    public Gs(int id, String name, String thesisTitle) {
        super(id, name);
        this.thesisTitle = thesisTitle;
    }

    // Constructor for Gs with ID, Name, Thesis Title, and GPA
    public Gs(int id, String name, String thesisTitle, float gpa) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }

    // Getter for Thesis Title
    public String getThesisTitle() {
        return thesisTitle;
    }

    // Setter for Thesis Title
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    // Method to display student information and thesis title
    @Override
    public void display() {
        super.display(); // Call the display method from the Student class
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
