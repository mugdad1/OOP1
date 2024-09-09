package newpackage;

/**
 *
 * @author mugdad
 */
class point {
//class
    
    point() {
// constructer 
        x = 1; 
        y = 2;
        // if you make x and y privte it can't be used outside the class
    }

    point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    int x;
    int y;

}

public class Lab4 {

    public static void main(String[] args) {
        point p1 = new point(4,5); //remove 5,
        System.out.println(p1.x);
        System.out.println(p1.y);
        p1.x = 10;
        p1.y = 20;
        System.out.println(p1.x);
        System.out.println(p1.y);

    }
}
