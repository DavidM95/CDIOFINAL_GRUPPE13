package DAL.DAO;

import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

import java.sql.SQLException;
import java.util.List;

public interface IBrugerDAO {

    void opretBruger(IBrugerDTO user) throws IDALException.DALException, SQLException;

    IBrugerDTO getBrugerId(int userId) throws IDALException.DALException;

    IBrugerDTO getBrugerPassword(int userId) throws IDALException.DALException;

    IBrugerDTO getBruger(int brugerid) throws IDALException.DALException, SQLException;

    List<IBrugerDTO> getBrugerList() throws IDALException.DALException;

    void retBruger(IBrugerDTO user) throws IDALException.DALException, SQLException;

}

