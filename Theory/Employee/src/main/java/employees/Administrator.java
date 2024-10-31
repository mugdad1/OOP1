/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author mugdad
 */
 public class Administrator extends Employee {
    private String jobTitle;

    public Administrator(int ID, String name, String gender, double salary, String email, String address, String phoneNumber, String jobTitle) {
        super(ID, name, gender, salary, email, address, phoneNumber);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
