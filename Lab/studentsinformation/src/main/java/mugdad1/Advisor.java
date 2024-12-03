package mugdad1;

public class Advisor {
    private int advisorId; // Use camelCase for variable names
    private String advisorName; // Attributes
    private String advisorDept; // You can keep this as String if you prefer

    // Constructor
    Advisor(int advisorId, String advisorName, String advisorDept) {
        this.advisorId = advisorId;
        this.advisorName = advisorName;
        this.advisorDept = advisorDept;
    }

    // Override toString method for displaying advisor information
    public String toString() {
        return advisorId + " " + advisorName + " " + advisorDept;
    }

    // Getters
    public int getAdvisorId() {
        return advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public String getAdvisorDept() {
        return advisorDept;
    }

    // Setters
    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public void setAdvisorDept(String advisorDept) {
        this.advisorDept = advisorDept;
    }

    // Method to display advisor information
    public void displayInfoAdv() {
        System.out.println("Advisor Name: " + advisorName);
        System.out.println("Advisor ID: " + advisorId);
        System.out.println("Advisor Department: " + advisorDept);
    }
}
