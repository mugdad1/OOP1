/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mugdad1;

/**
 *
 * @author mugdad
 */
public class Advisor {
    private int AdvisorId; // Use camelCase for variable names
    private String AdvisorName;
    private String AdvisorDept; // You can keep this as String if you prefer
    Advisor(int AdvisorId , String AdvisorName , String AdvisorDept){
        this.AdvisorId = AdvisorId;
        this.AdvisorName = AdvisorName;
        this.AdvisorDept = AdvisorDept;
        
    }
   
    public String toString()
    {
        return AdvisorId+AdvisorName+AdvisorDept;
    }
    public int getAdvisorId() {
        return AdvisorId;
    }

    public void setAdvisorId(int AdvisorId) {
        this.AdvisorId = AdvisorId;
    }

    public String getAdvisorName() {
        return AdvisorName;
        
    }

    public void setAdvisorName(String AdvisorName) {
        this.AdvisorName = AdvisorName;
    }

    public String getAdvisorDept() {
        return AdvisorDept;
    }

    public void setAdvisorDept(String AdvisorDept) {
        this.AdvisorDept = AdvisorDept;
    }
    
    
}
