package DAL.DTO;


import java.util.List;

public interface IBrugerDTO {
    int getBrugerId();

    String getBrugerNavn();

    String getBrugerPassword();

    String getBrugerIni();

    String getBrugerRole();

    boolean getErAktiv();

    void setErAktiv(boolean erAktiv);

    void setBrugerId(int brugerId);

    void setBrugerNavn(String brugerNavn);

    void setBrugerIni(String brugerIni);

    void setBrugerPassword(String brugerPassword);

    void setBrugerRole(String brugerRole);
}
