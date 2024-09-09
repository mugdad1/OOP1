package studentsinformation;

/**
 *
 * @author mugdad
 */
public class StudentsInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student(101,"ahmed ", 4.5f );
        Student st2 = new Student(101,"ahlam ", (float) 2.5 );
        st1.DisplayInfo();
        st2.DisplayInfo();
        
    }
    
}
