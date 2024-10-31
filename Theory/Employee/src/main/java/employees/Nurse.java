/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;
public class Nurse extends Employee {
    private String nursePractitioner;
    private String directorOfNursing;
    private String chiefNursingOfficer;

    public Nurse(int ID, String name, String gender, double salary, String email, String address, String phoneNumber) {
        super(ID, name, gender, salary, email, address, phoneNumber);
    }

    public String getNursePractitioner() {
        return nursePractitioner;
    }

    public void setNursePractitioner(String nursePractitioner) {
        this.nursePractitioner = nursePractitioner;
    }

    public String getDirectorOfNursing() {
        return directorOfNursing;
    }

    public void setDirectorOfNursing(String directorOfNursing) {
        this.directorOfNursing = directorOfNursing;
    }

    public String getChiefNursingOfficer() {
        return chiefNursingOfficer;
    }

    public void setChiefNursingOfficer(String chiefNursingOfficer) {
        this.chiefNursingOfficer = chiefNursingOfficer;
    }
}
