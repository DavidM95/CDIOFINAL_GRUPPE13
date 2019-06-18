package DAL.DTO;

import java.util.ArrayList;

public interface IReceptDTO {

    int getReceptId();
    String getReceptNavn();
    ArrayList<ReceptKomponentDTO> getReceptKomponent();
}
