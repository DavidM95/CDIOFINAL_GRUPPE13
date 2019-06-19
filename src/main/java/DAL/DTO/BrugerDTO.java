package DAL.DTO;


import java.util.List;

public class BrugerDTO implements IBrugerDTO {

    private int brugerId;
    private String brugerNavn;
    private String brugerIni;
    private String brugerPassword;
    private String brugerRole;

    public BrugerDTO(int brugerId, String brugerNavn, String brugerIni,
                     String brugerPassword, String brugerRole) {


        this.brugerId = brugerId;
        this.brugerNavn = brugerNavn;
        this.brugerIni = brugerIni;
        this.brugerPassword = brugerPassword;
        this.brugerRole = brugerRole;
    }

    public BrugerDTO() {

    }

    @Override
    public int getBrugerId() {
        return this.brugerId;
    }

    @Override
    public String getBrugerNavn() {
        return this.brugerNavn;
    }

    @Override
    public String getBrugerPassword() {
        return this.brugerPassword;
    }

    @Override
    public String getBrugerIni() {
        return this.brugerIni;
    }

    @Override
    public String getBrugerRole() {
        return this.brugerRole;
    }


    public void setBrugerId(int brugerId) {
        this.brugerId = brugerId;
    }

    public void setBrugerNavn(String brugerNavn) {
        this.brugerNavn = brugerNavn;
    }

    public void setBrugerIni(String brugerIni) {
        this.brugerIni = brugerIni;
    }

    public void setBrugerPassword(String brugerPassword) {
        this.brugerPassword = brugerPassword;
    }

    public void setBrugerRole(String brugerRole) {
        this.brugerRole = brugerRole;
    }

    @Override
    public String toString() {
        return "BrugerDTO{" +
                "brugerId=" + brugerId +
                ", brugerNavn='" + brugerNavn + '\'' +
                ", brugerIni=" + brugerIni +
                ", brugerPassword=" + brugerPassword +
                ", brugerRole=" + brugerRole +
                '}';
    }
}
