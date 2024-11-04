
package mugdad1;

/**
 *
 * @author mugdad
 */
public class Student extends Person{ 
    float Gpa;
    
    Student(int Id , String Name){
        
        super(Id, Name);
    }
    Student(int Id , String Name , float Gpa){
        super(Id ,Name);
        this.Gpa=Gpa;
}
    void Display(){
        super.Display();
        System.out.println("gp" + Gpa);
    }



}