/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mugdad1;

/**
 *
 * @author mugdad
 */
public class Main {
    public static void main(String[] args) {
        Person st1 = new Person(1,"david");
        st1.Display();
        Student s1 = new Student(2, "ali",3.5f);
        s1.Display();
        Advisor ad1 = new Advisor(3,"sanad","cs");
        ad1.Display();
        Gs gg = new Gs(4,"mugdad","ai",4.4f);
        gg.Display();
        Ug ug = new Ug (54, "hassan", "forloop", 22f);
        ug.Display();
    }
}
