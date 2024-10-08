package mugdad1;

public class Countries {
    private String name;
    private String capital;
    private float area;
    private int population;

    Countries(String name, String capital , float area , int population){
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.population = population;

    }
    Countries(){

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    Countries(String name, String capital){
        this.name= name;
        this.capital = capital;

    }
    Countries(String name, String capital,float area){
        this.name= name;
        this.capital = capital;
        this.area= area;
        
    }
    void display(){
        System.out.println("Name " + name);
        System.out.println(" Capital " + capital);
        System.out.println(" Area  " + area);
        System.out.println(" Population " + population);
    }

}

