
package mugdad1;

/**
 *
 * @author mugdad
 */
public class Student extends Person implements Resonsible{  
    float Gpa;
    
    Student(int Id , String Name){
        
        super(Id, Name);
    }
    Student(int Id , String Name , float Gpa){
        super(Id ,Name);
        this.Gpa=Gpa;
}
    void Display(){
        System.out.println("gp" + Gpa);
    }
    @Override
    public void study() {
        System.out.println("i'm student in java class");


    }
    @Override
    public void printdata() {
        System.out.println("i'm student in python class");

    }




}