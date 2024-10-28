package mugdad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mugdad
 */
public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public String toString() {
        return String.format("Commission Employee: %s %s\nSSN: %s\nGross Sales: %.2f\nCommission Rate: %.2f",
                firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}


