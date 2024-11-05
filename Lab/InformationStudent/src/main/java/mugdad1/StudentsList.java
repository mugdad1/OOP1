package mugdad1;

import java.util.ArrayList;
public class StudentsList {

    private ArrayList<Student> studentsList;
    public StudentsList(){
        studentsList = new ArrayList<Student>();

    }
     void addStudent(Student student){
    studentsList.add(student);
    }

    public void DisplayStudents(){
        for(Student s: studentsList){
            s.Display();
        }
    }
    public Student search(int id){
        Student targetStudent = null;
        for(Student s: studentsList){
            if(s.getId()==id){
                targetStudent = s;
                break;
            
            }

        }
    return targetStudent;
    }
    public Student search(String name){
        Student targetStudent = null;
        for(Student s: studentsList){
            if(s.getName().equals(name)){
                targetStudent = s;
                break;
            
            }

        }
    return targetStudent;
    }





}

