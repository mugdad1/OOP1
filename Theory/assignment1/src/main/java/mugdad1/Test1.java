

    package mugdad1;


    public class Test1 {
    public static void main(String[] args) {
        Ship1 s1 = new Ship1();
        s1.x = 0.0;
        s1.y = 0.0;
        s1.speed = 1.0;
        s1.direction = 0.0;   // East
        s1.name = "Ship1";
        Ship1 s2 = new Ship1();
        s2.x = 0.0;
        s2.y = 0.0;
        s2.speed = 2.0;
        s2.direction = 135.0; // Northwest
        s2.name = "Ship2";
        s1.x = s1.x + s1.speed
            * Math.cos(s1.direction * Math.PI / 180.0);
        s1.y = s1.y + s1.speed
            * Math.sin(s1.direction * Math.PI / 180.0);
        s2.x = s2.x + s2.speed
            * Math.cos(s2.direction * Math.PI / 180.0);
        s2.y = s2.y + s2.speed
            * Math.sin(s2.direction * Math.PI / 180.0);
        System.out.println(s1.name + " is at ("
                        + s1.x + "," + s1.y + ").");
        System.out.println(s2.name + " is at ("
                        + s2.x + "," + s2.y + ").");
    }
    }
