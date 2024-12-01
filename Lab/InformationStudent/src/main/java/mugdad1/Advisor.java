package mugdad1;

public class Advisor extends Person {
    private String department; // Changed to lowercase for consistency

    // Constructor for Advisor with ID and Name
    public Advisor(int id, String name) {
        super(id, name);
    }

    // Constructor for Advisor with ID, Name, and Department
    public Advisor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Getter for Department
    public String getDepartment() {
        return department;
    }

    // Setter for Department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to display advisor information
    @Override
    public void display() {
        display(); // Call the display method from the Person class
        System.out.println("Department: " + department);
    }
}
