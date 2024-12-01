package mugdad1;

public class Ug extends Student {
    private String project; // Changed to lowercase for consistency

    // Constructor for Ug with ID, Name, and Project
    public Ug(int id, String name, String project) {
        super(id, name);
        this.project = project;
    }

    // Constructor for Ug with ID, Name, Project, and GPA
    public Ug(int id, String name, String project, float gpa) {
        super(id, name, gpa);
        this.project = project;
    }

    // Getter for Project
    public String getProject() {
        return project;
    }

    // Setter for Project
    public void setProject(String project) {
        this.project = project;
    }

    // Method to display student information and project
    @Override
    public void display() {
        super.display(); // Call the display method from the Student class
        System.out.println("Project: " + project);
    }
}
