package DAL.DTO;


public class BrugerDTO implements IBrugerDTO {

    private int brugerId;
    private String brugerNavn;
    private String brugerIni;
    private String brugerPassword;
    private String brugerRole;
    private boolean erAktiv;

    public BrugerDTO(int brugerId, String brugerNavn, String brugerIni,
                     String brugerPassword, String brugerRole, boolean erAktiv) {


        this.brugerId = brugerId;
        this.brugerNavn = brugerNavn;
        this.brugerIni = brugerIni;
        this.brugerPassword = brugerPassword;
        this.brugerRole = brugerRole;
        this.erAktiv = erAktiv;
    }

    public BrugerDTO() {

    }
//
//    public BrugerDTO(int brugerId, String brugerNavn, String brugerIni, String brugerPassword, String brugerRole, boolean erAktiv) {
//    }

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

    @Override
    public boolean getErAktiv() {
        return this.erAktiv;
    }

    @Override
    public void setErAktiv(boolean erAktiv) {
        this.erAktiv = erAktiv;
    }

    @Override
    public void setBrugerId(int brugerId) {
        this.brugerId = brugerId;
    }

    @Override
    public void setBrugerNavn(String brugerNavn) {
        this.brugerNavn = brugerNavn;
    }

    @Override
    public void setBrugerIni(String brugerIni) {
        this.brugerIni = brugerIni;
    }

    @Override
    public void setBrugerPassword(String brugerPassword) {
        this.brugerPassword = brugerPassword;
    }

    @Override
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
                ", aktiv=" + erAktiv +
                '}';
    }
}
