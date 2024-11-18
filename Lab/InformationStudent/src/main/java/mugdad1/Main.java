/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mugdad1;

import java.util.InputMismatchException;
/**
 *
 * @author mugdad
 */
import java.util.Scanner;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(n1/n2);
        }
        catch (ArithmeticException e)
        {
            System.out.println("math err");
        }
        
        catch (InputMismatchException e)
        {
            System.out.println("wrong type err");
        }
        /* 
        catch(Exception e )

        {
            
            System.out.println(e);
        }

        
        System.out.println("bye bye ");
        */
        /*Person st1 = new Student(1,"david");
        st1.getId();
        
        //Person st1 = new Person(1,"david");
          
         
        //st1.Display();

        Student s1 = new Student(2, "ali",3.5f);
        s1.Display();
        Student s2 = new Student(1, "moh",4.5f);
        s1.Display();
        Student s3 = new Student(4,"gf");
        s3.printdata();
        s3.study();
        Advisor ad1 = new Advisor(3,"sanad","cs");
        ad1.Display();
        Gs gg = new Gs(4,"mugdad"," ai",4.4f);
        gg.Display();
        Ug ug = new Ug (54, "hassan", "forloop", 22f);
        ug.Display();
        StudentsList sList = new StudentsList();
        sList.addStudent(s1);
        sList.addStudent(s2);
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id ");
        id = scanner.nextInt();
        Student target = sList.search(id);
        if (target==null){
            System.out.println("not exsit");
        }else{
            target.Display();
        }
        String Name;
        System.out.println("enter name ");
        Name = scanner.next();
        target = sList.search(Name);
        if(target == null){
            System.out.println("not exsit");
        
        }else{
            target.Display();

    }
*/
    }
}


