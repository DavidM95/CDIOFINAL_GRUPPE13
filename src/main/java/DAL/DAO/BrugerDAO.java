package DAL.DAO;

import DAL.Connect;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrugerDAO implements IBrugerDAO {


    private final String url = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s160601?";
    private final String userName = "user=s160601";
    private final String pass = "password=t08HP36o2H0HGQzFhf4qo";

    @Override
    public void opretBruger(IBrugerDTO brugerDTO) throws SQLException {

        try {
            Connection connection = Connect.getInstance().createConnection();
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url + userName + "&" + pass);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Bruger VALUES (?,?,?,?,?);");

            statement.setInt(1, brugerDTO.getBrugerId());
            statement.setString(2, brugerDTO.getBrugerNavn());
            statement.setString(3, brugerDTO.getBrugerIni());
            statement.setString(4, brugerDTO.getBrugerPassword());
            statement.setString(5, brugerDTO.getBrugerRole());
            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public IBrugerDTO getBrugerId(int userId) throws IDALException.DALException {
        return null;
    }

    @Override
    public IBrugerDTO getBrugerPassword(int userId) throws IDALException.DALException {
        IBrugerDTO dao = new BrugerDTO();
        return dao;
    }

    @Override
    public IBrugerDTO getBruger(int brugerId) throws SQLException {
        try {
            Connection connection = Connect.getInstance().createConnection();

            PreparedStatement statement = connection.prepareStatement("SELECT*FROM Bruger WHERE BrugerID = ?;");

            statement.setInt(1, brugerId);

            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            IBrugerDTO user = new BrugerDTO(resultSet.getInt("brugerId"), resultSet.getString("brugerNavn"), resultSet.getString("ini"), resultSet.getString("password"), resultSet.getString("rolle"));

            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BrugerDTO> getBrugerListe() throws SQLException {

        List<BrugerDTO> brugere = new ArrayList<>();
        BrugerDTO bruger;
        BrugerDTO brugerDTO = null;
        try {
            Connection connection = Connect.getInstance().createConnection();

            PreparedStatement statement = connection.prepareStatement("SELECT*FROM Bruger;");

            ResultSet res = statement.executeQuery();

            while (res.next()) {
                bruger = new BrugerDTO();
                bruger.setBrugerId(res.getInt("brugerID"));
                bruger.setBrugerNavn(res.getString("brugerNavn"));
                bruger.setBrugerIni(res.getString("ini"));
                bruger.setBrugerPassword(res.getString("password"));
                bruger.setBrugerRole(res.getString("rolle"));

                brugere.add(bruger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return brugere;
    }

    @Override
    public void retBruger(IBrugerDTO brugerDTO) throws SQLException {
        try {
            Connection connection = Connect.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE Bruger SET brugerNavn = ?, ini = ?, password = ?, rolle = ? WHERE BrugerID = ?;");

            statement.setString(1, brugerDTO.getBrugerNavn());
            statement.setString(2, brugerDTO.getBrugerIni());
            statement.setString(3, brugerDTO.getBrugerPassword());
            statement.setInt(4, brugerDTO.getBrugerId());
            statement.setString(5, brugerDTO.getBrugerRole());
            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sletBruger(int id) {
        try {
            Connection connection = Connect.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE * FROM Bruger WHERE BrugerID = ?;");

            statement.setInt(1, id);
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

