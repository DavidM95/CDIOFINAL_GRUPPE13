package Controllers;
import DAL.DAO.IRåvareDAO;
import DAL.DAO.RåvareDAO;
import DAL.DTO.IRåvareDTO;
import  DAL.DTO.RåvareDTO;
import DAL.IDALException;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.Connection;
import java.sql.SQLException;

public class RåvarerCTRL implements IRåvareDAO {

    public Boolean råvareIdCheck(int råvareId) throws SQLException {
        IRåvareDAO råvareDAO = new RåvareDAO();
        IRåvareDTO råvareDTO = råvareDAO.getRåvare(råvareId);
        if (råvareDTO.getRåvareId() == råvareId){
            return true;
        }else return false;
    }


    public void opretRåvarer(int råvareId, String råvareNavn, String leverandør) throws SQLException {
        IRåvareDAO råvareDAO = new RåvareDAO();
        IRåvareDTO råvareDTO = new RåvareDTO(råvareId,råvareNavn,leverandør);
        if (!råvareIdCheck(råvareId)){
            råvareDAO.createRåvare(råvareDTO);
        }else{
            //TODO send fejlbesked om at råvare iddet allerede er taget
        }

    }

    public IRåvareDTO seRåvare(int råvareId) throws SQLException {
        IRåvareDAO råvareDAO = new RåvareDAO();
        IRåvareDTO råvareDTO = råvareDAO.getRåvare(råvareId);
        if (råvareIdCheck(råvareId)){
            return råvareDTO;
        }else return null;
    }

    public void retRåvare(int råvareId, String råvarenavn, String leverandør) throws SQLException {
        IRåvareDAO råvareDAO = new RåvareDAO();
        IRåvareDTO råvareDTO = råvareDAO.getRåvare(råvareId);
        if (råvareIdCheck(råvareId)){
            råvareDAO.retRåvare(råvareDTO);
        }else {
            //TODO giv en fejlbesked om at der ikke fandtes nogen råvare til det pågældende ID.
        }
    }


    @Override
    public void createRåvare(IRåvareDTO råvareDTO) throws SQLException {

    }

    @Override
    public RåvareDTO getRåvare(int ID) throws SQLException {
        return null;
    }

    @Override
    public void retRåvare(IRåvareDTO råvareDTO) throws SQLException {

    }

    @Override
    public void deleteRåvare(int ID) throws SQLException {

    }

}

