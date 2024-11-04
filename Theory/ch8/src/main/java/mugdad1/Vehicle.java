package mugdad1;

public class Vehicle {
    void run(){
        System.out.println("vehicle is running");
    }
}
class Bike2 extends Vehicle{
    @Override
    void run(){
        System.out.println("bike is running ");
    }
    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
        
    }
}
