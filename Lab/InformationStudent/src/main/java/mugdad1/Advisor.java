/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mugdad1;

/**
 *
 * @author mugdad
 */
public class Advisor extends Person{
    private String Dept;
    public Advisor(int Id, String Name) {
        super(Id, Name);
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }
    public Advisor(int Id, String Name , String Dept) {
        super(Id, Name);
        this.Dept = Dept;
    }
        void Display(){
            super.Display();
            System.out.println("dept "+Dept);
            
    
    }
    
    
}
