package mugdad1;

/**
 *
 * @author mugdad
 */
public class Gs extends Student {
    private String thesisT;
    Gs(int Id, String Name ,String thesisT){
        super(Id, Name);
        this.thesisT = thesisT;
    }
    Gs(int Id, String Name ,String thesisT , float Gpa){
        super(Id, Name ,Gpa);
        this.thesisT = thesisT;
    }

    public String getThesisT() {
        return thesisT;
    }

    public void setThesisT(String thesisT) {
        this.thesisT = thesisT;
    }
    void Display(){
        super.Display();
        System.out.println("thesis" +thesisT);
    }
    
    
}
