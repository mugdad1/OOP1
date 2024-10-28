/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mugdad1;

/**
 *
 * @author mugdad
 */
    public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate, double salary) {
        super(firstName, lastName, ssn, sales, rate);
        this.baseSalary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s\nBase Salary: %.2f", super.toString(), baseSalary);
    }
}


