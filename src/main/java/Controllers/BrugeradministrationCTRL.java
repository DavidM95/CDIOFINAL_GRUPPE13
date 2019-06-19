package Controllers;


import DAL.DAO.BrugerDAO;
import DAL.DAO.IBrugerDAO;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

import java.sql.SQLException;
import java.util.List;

public class BrugeradministrationCTRL {

    public boolean BrugerIdCheck(int brugerId) throws IDALException.DALException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = brugerDAO.getBrugerId(brugerId);
        if (brugerDTO.getBrugerId() == brugerId) { //TODO Test
            return true;
        } else {
            return false;
        }
    }

    public boolean LoginChecker(int brugerId, String brugerPassword) throws IDALException.DALException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = brugerDAO.getBrugerId(brugerId);
        if (BrugerIdCheck(brugerId) && brugerDTO.getBrugerPassword().equals(brugerPassword)) {
            return true;
        } else return false; //TODO Implemnter besked om at brugerId og password ike passede sammen

    }

    public void opretBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword, String brugerRole) throws IDALException.DALException, SQLException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = new BrugerDTO(brugerId, brugerNavn, brugerIni, brugerPassword, brugerRole); // TODO tilføj roller
//        if (!BrugerIdCheck(brugerId)) {
        brugerDAO.opretBruger(brugerDTO);
//        }
    }

    public void retBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword, String brugerRolle) throws IDALException.DALException, SQLException { //TODO tilføj roller som en variable
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = new BrugerDTO(brugerId, brugerNavn, brugerIni, brugerPassword, brugerRolle); // TODO tilføj roller
//        if (BrugerIdCheck(brugerId)) {
        brugerDAO.retBruger(brugerDTO);
//        }else{
        //TODO returnere en fejlbesked
//        }
    }

    public IBrugerDTO seBruger(int brugerId) throws IDALException.DALException, SQLException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = brugerDAO.getBruger(brugerId);


   //     if (BrugerIdCheck(brugerId)) {
        // TODO få DAO til at virke
        return brugerDTO;
    //    }else return null; //TODO tilføj fejlbesked ved ugyldigt ID
    }



    public List<BrugerDTO> brugerListe() throws SQLException, IDALException.DALException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        return brugerDAO.getBrugerListe();
    }

}
