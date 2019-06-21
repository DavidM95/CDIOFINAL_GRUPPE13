package DAL;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnect {

    Connection createConnection() throws SQLException;
    void closeConnection() throws SQLException;
}
