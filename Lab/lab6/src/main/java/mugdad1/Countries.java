package mugdad1;

public class Countries {
    private String Name;
    private String Capital;
    private float Area;
    private int Population;

    Countries(String Name, String Capital , float Area , int Population){
        this.Name = Name;
        this.Capital = Capital;
        this.Area = Area;
        this.Population = Population;

    }
    Countries(){

    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int Population) {
        this.Population = Population;
    }
    
    Countries(String Name, String Capital){
        this.Name= Name;
        this.Capital = Capital;

    }
    Countries(String Name, String Capital,float Area){
        this.Name= Name;
        this.Capital = Capital;
        this.Area= Area;
        
    }
    void display(){
        System.out.println("name " + Name);
        System.out.println(" capital " + Capital);
        System.out.println(" area  " + Area);
        System.out.println(" population " + Population);
    }

}

