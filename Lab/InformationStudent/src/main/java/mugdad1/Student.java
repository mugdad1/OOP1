package mugdad1;

public class Student extends Person implements Resonsible {  
    private float gpa; // Changed to lowercase for consistency
    
    // Constructor for Student with ID and Name
    public Student(int id, String name) {
        super(id, name);
    }

    // Constructor for Student with ID, Name, and GPA
    public Student(int id, String name, float gpa) {
        super(id, name);
        this.gpa = gpa;
    }

    // Method to display GPA
    public void display() {
        System.out.println("GPA: " + gpa);
    }

    @Override
    public void study() {
        System.out.println("I'm a student in Java class.");
    }

    @Override
    public void printdata() {
        System.out.println("I'm a student in Python class.");
    }
}
