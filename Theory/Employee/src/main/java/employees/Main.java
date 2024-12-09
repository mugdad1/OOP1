package employees;

/**
 *
 * @author mugdad
 * */

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", "Male", 50000, "john.doe@example.com", "123 Main St", "555-1234");
        emp.displayInfo();

        Administrator admin = new Administrator(2, "Jane Smith", "Female", 60000, "jane.smith@example.com", "456 Elm St", "555-5678", "HR Manager");
        admin.displayInfo();
        System.out.println("Job Title: " + admin.getJobTitle());

        Nurse nurse = new Nurse(3, "Alice Johnson", "Female", 55000, "alice.johnson@example.com", "789 Oak St", "555-8765");
        nurse.setNursePractitioner("Certified Nurse Practitioner");
        nurse.displayInfo();
        System.out.println("Nurse Practitioner: " + nurse.getNursePractitioner());

        Doctor doctor = new Doctor(4, "Bob Brown", "Male", 120000, "bob.brown@example.com", "321 Pine St", "555-4321");
        doctor.setSpecialty("Cardiology");
        doctor.displayInfo();
        System.out.println("Specialty: " + doctor.getSpecialty());
    }
}
