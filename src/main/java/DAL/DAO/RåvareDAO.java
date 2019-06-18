package DAL.DAO;

import DAL.Connect;
import DAL.DTO.IRåvareDTO;
import DAL.DTO.RåvareDTO;
import DAL.IConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RåvareDAO implements IRåvareDAO, IConnect {

    public void createRåvare(IRåvareDTO råvareDTO) throws SQLException {
        createConnection();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into Råvare values(?,?,?);");

            statement.setInt(1, råvareDTO.getRåvareId());
            statement.setString(2, råvareDTO.getRåvarenavn());
            statement.setString(3, råvareDTO.getLeverandør());

            statement.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
        closeConnection();
    }

    public RåvareDTO getRåvare(int ID) throws SQLException {
        createConnection();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Råvare WHERE RåvareID = ?;");

            statement.setInt(1, ID);

            ResultSet resultSet = statement.executeQuery();

            RåvareDTO råvareDTO = null;

            while (resultSet.next()){
                råvareDTO = new RåvareDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            }

            return råvareDTO;

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    public void retRåvare(IRåvareDTO råvareDTO) throws SQLException {
        createConnection();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE Råvare SET Råvarenavn = ?, Leverandør = ? WHERE RåvareId = ?;");

            statement.setInt(3, råvareDTO.getRåvareId());
            statement.setString(1, råvareDTO.getRåvarenavn());
            statement.setString(2, råvareDTO.getLeverandør());

            statement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteRåvare(int ID) throws SQLException {
        Connection connection = Connect.getInstance().createConnection();
            try {
            PreparedStatement statement = connection.prepareStatement("DELETE from Råvare WHERE RåvareId  = ?;");

            statement.setInt(1, ID);

            statement.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public Connection createConnection() throws SQLException {
        Connection connection = Connect.getInstance().createConnection();
        return connection;
    }


    public Connection getConnection() throws  SQLException{
        Connection connection = Connect.getInstance().createConnection();
        return connection;
    }

    @Override
    public void closeConnection() throws SQLException {

    }
}
