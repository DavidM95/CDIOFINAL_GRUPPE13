package DAL.DAO;

import DAL.DTO.IReceptDTO;

import java.sql.Connection;
import java.sql.SQLException;

public interface IReceptDAO {

    void opretRecept(IReceptDTO receptDTO) throws SQLException;
    IReceptDTO getRecept(int ID) throws SQLException;
}
