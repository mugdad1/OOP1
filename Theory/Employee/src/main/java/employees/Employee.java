package employees;
public class Employee {
    private int ID;
    private String name;
    private String gender;
    private double salary;
    private String email;
    private String address;
    private String phoneNumber;

    public Employee(int ID, String name, String gender, double salary, String email, String address, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.ID);
        System.out.println("Gender: " + this.gender);
        System.out.println("Email: " + this.email);
        System.out.println("Salary: " + this.salary);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
    }
}
