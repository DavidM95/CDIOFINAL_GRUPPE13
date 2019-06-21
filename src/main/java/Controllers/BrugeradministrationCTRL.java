package Controllers;


import DAL.DAO.BrugerDAO;
import DAL.DAO.IBrugerDAO;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

import java.sql.SQLException;
import java.util.List;

public class BrugeradministrationCTRL implements IDALException {

    public boolean BrugerIdCheck(int brugerId) throws DALException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = brugerDAO.getBrugerId(brugerId);
        if (brugerDTO.getBrugerId() == brugerId) {
            return true;
        } else {
            return false;
        }
    }

    public boolean LoginChecker(int brugerId, String brugerPassword) throws DALException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = brugerDAO.getBrugerId(brugerId);
        if (BrugerIdCheck(brugerId) && brugerDTO.getBrugerPassword().equals(brugerPassword)) {
            return true;
        } else return false;

    }

    public void opretBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword, String brugerRole, boolean erAktiv) throws DALException, SQLException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = new BrugerDTO(brugerId, brugerNavn, brugerIni, brugerPassword, brugerRole, erAktiv);
//        if (!BrugerIdCheck(brugerId)) {
        brugerDAO.opretBruger(brugerDTO);
//        }
    }

    public void retBruger(BrugerDTO brugerDTO) throws DALException, SQLException {
        IBrugerDAO brugerDAO = new BrugerDAO();
//        if (BrugerIdCheck(brugerId)) {
        brugerDAO.retBruger(brugerDTO);
//        }else{
//        }
    }

    public IBrugerDTO seBruger(int brugerId) throws DALException, SQLException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        IBrugerDTO brugerDTO = brugerDAO.getBruger(brugerId);
        //     if (BrugerIdCheck(brugerId)) {
        return brugerDTO;
        //    }else return null;
    }


    public List<BrugerDTO> brugerListe() throws SQLException, DALException {
        IBrugerDAO brugerDAO = new BrugerDAO();
        return brugerDAO.getBrugerListe();
    }

    public void setBrugerAktivitet(int id) throws DALException, SQLException {
        IBrugerDAO dao = new BrugerDAO();
        IBrugerDTO brugerDTO = dao.getBruger(id);
        brugerDTO.setErAktiv(!brugerDTO.getErAktiv());
        dao.setBrugerAktivitet(brugerDTO);
    }
}
