package newpackage;

/**
 *
 * @author mugdad
 */
class point {
     point(){
    x= 1;
    y =2;
    }

    int x;
    int y;

}

public class Lab4 {

    public static void main(String[] args) {
        point p1 = new point();
        System.out.println(p1.x);
        System.out.println(p1.y);
        p1.x = 10;
        p1.y = 20;
        System.out.println(p1.x);
        System.out.println(p1.y);

    }
}
