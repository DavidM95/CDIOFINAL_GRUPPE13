package DAL.DAO;

import DAL.DTO.IRåvareDTO;
import DAL.DTO.RåvareDTO;

import java.sql.Connection;
import java.sql.SQLException;

public interface IRåvareDAO {

    void createRåvare(IRåvareDTO råvareDTO) throws SQLException;

    RåvareDTO getRåvare(int ID) throws SQLException;

    void retRåvare(IRåvareDTO råvareDTO) throws SQLException;

    void deleteRåvare(int ID) throws SQLException;
}
