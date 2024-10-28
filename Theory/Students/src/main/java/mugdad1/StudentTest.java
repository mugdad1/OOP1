/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mugdad1;

/**
 *ss
 * @author mugdad
 */
class Student { 
    private int id; 
    public String name; 
    private String dept; 

    public Student(int id, String name, String dept) { 
        this.id = id; 
        this.name = name; 
        this.dept = dept; 
        System.out.println("student created " + name);
        System.out.println(dept);

    } 

    public void setDept(String dept) { 
        this.dept = dept; 
    } 

    public int getID() { 
        return this.id; 
    } 

    public String getName() { 
        return this.name; 
    } 

    public String getDept() {
       return this.dept; 
    } 

    public void displayStudentRecord() { 
        System.out.printf("Student ID: %d \n", id); 
        System.out.printf("Student Name: %s \n", name); 
        System.out.printf("Student Department: %s \n", dept); 
    } 
} 

public class StudentTest { 
    public static void main(String[] args) { 
        Student s1 = new Student(101, "Ali", "CS"); 
        Student s2 = new Student(102, "Noor", "IS"); 
        Student s3 = new Student(103, "Monua", "CN"); 
        s1.name="f"; // & this sets the nme outside the class
        System.out.println("id 2 is "+s2.getID()); //so this gets only the specific id 
        s1.displayStudentRecord(); 
        s2.displayStudentRecord(); 
    } 
}
