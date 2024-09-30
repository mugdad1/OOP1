package mugdad1;

public class Main {

    public static void main(String[] args) {
        Countries c1 = new Countries(" saudi ", " alhasa ", 200, 1000);
        Countries c2 = new Countries();
        Countries c3 = new Countries(" jordan ", " amman ");
        Countries c4 = new Countries(" alhammad ", " mugdad ", 5500);
        
        c1.display();
        c2.display();
        c3.display();
        c4.display();

    }
}
