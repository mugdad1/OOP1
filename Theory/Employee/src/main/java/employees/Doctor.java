/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author mugdad
 */
public class Doctor extends Employee {
    private String intern;
    private String juniorResident;
    private String fellow;
    private String specialty;

    public Doctor(int ID, String name, String gender, double salary, String email, String address, String phoneNumber) {
        super(ID, name, gender, salary, email, address, phoneNumber);
    }

    public String getIntern() {
        return intern;
    }

    public void setIntern(String intern) {
        this.intern = intern;
    }

    public String getJuniorResident() {
        return juniorResident;
    }

    public void setJuniorResident(String juniorResident) {
        this.juniorResident = juniorResident;
    }

    public String getFellow() {
        return fellow;
    }

    public void setFellow(String fellow) {
        this.fellow = fellow;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
