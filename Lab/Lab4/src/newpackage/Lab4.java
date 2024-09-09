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
    }
    point(int _x, int _y){
        x = _x;
        y = _y;
    }
   
     


    int x;
    int y;

}

public class Lab4 {

    public static void main(String[] args) {
        point p1 = new point(5,5);
        System.out.println(p1.x);//1
        System.out.println(p1.y);//2
        p1.x = 10;
        p1.y = 20;
        System.out.println(p1.x);
        System.out.println(p1.y);

    }
}
