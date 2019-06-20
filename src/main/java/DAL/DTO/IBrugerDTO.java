package DAL.DTO;


import java.util.List;

public interface IBrugerDTO {
    int getBrugerId();

    String getBrugerNavn();

    String getBrugerPassword();

    String getBrugerIni();

    String getBrugerRole();

    boolean getErAktiv();
}
