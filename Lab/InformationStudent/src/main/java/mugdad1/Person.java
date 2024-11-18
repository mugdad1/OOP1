package mugdad1;

/**
 *
 * @author mugdad
 */
public abstract class Person { /*
    * abstract remove to make coder 
     */
    private int Id;
    private String Name;

    public Person(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    abstract void Display(); /*{
        System.out.println("id = " + Id);
        System.out.println("Name = " + Name);
    }*/
}
