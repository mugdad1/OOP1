
package mugdad1;

/**
 *
 * @author mugdad
 */
public class Ug extends Student {
    private String Project;
    Ug(int Id,String Name , String Project){
        super(Id,Name);
        this.Project = Project;
    }
    Ug(int Id,String Name , String Project , float Gpa){
        super(Id,Name,Gpa);
        this.Project = Project;

    
    
}

    public String getProject() {
        return Project;
    }

    public void setProject(String Project) {
        this.Project = Project;
    }
    void Display(){
        super.Display();
        System.out.println("project " + Project);
    }

}
