package DAL.DAO;

import DAL.Connect;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrugerDAO implements IBrugerDAO {


    @Override
    public void opretBruger(IBrugerDTO brugerDTO) {

        try {
            Connection connection = Connect.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Bruger VALUES (?,?,?,?,?,?);");

            statement.setInt(1, brugerDTO.getBrugerId());
            statement.setString(2, brugerDTO.getBrugerNavn());
            statement.setString(3, brugerDTO.getBrugerIni());
            statement.setString(4, brugerDTO.getBrugerPassword());
            statement.setString(5, brugerDTO.getBrugerRole());
            statement.setBoolean(6, brugerDTO.getErAktiv());

            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public IBrugerDTO getBrugerId(int userId) {
        return null;
    }

    @Override
    public IBrugerDTO getBrugerPassword(int userId) {
        IBrugerDTO dto = new BrugerDTO();
        return dto;
    }

    @Override
    public IBrugerDTO getBruger(int brugerId) {
        try {
            Connection connection = Connect.getInstance().createConnection();

            PreparedStatement statement = connection.prepareStatement("SELECT*FROM Bruger WHERE BrugerID = ?;");

            statement.setInt(1, brugerId);

            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            IBrugerDTO user = new BrugerDTO(resultSet.getInt("brugerId"), resultSet.getString("brugerNavn"), resultSet.getString("ini"), resultSet.getString("password"), resultSet.getString("rolle"), resultSet.getBoolean("aktiv"));

            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BrugerDTO> getBrugerListe() {

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
                bruger.setErAktiv(res.getBoolean("aktiv"));

                brugere.add(bruger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return brugere;
    }

    @Override
    public void retBruger(IBrugerDTO brugerDTO) {
        try {
            Connection connection = Connect.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE Bruger SET brugerNavn = ?, ini = ?, password = ?, rolle = ? WHERE BrugerID = ?;");
            System.out.println(brugerDTO);
            statement.setString(1, brugerDTO.getBrugerNavn());
            statement.setString(2, brugerDTO.getBrugerIni());
            statement.setString(3, brugerDTO.getBrugerPassword());
            statement.setString(4, brugerDTO.getBrugerRole());
            statement.setInt(5, brugerDTO.getBrugerId());
            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void setBrugerAktivitet(IBrugerDTO brugerDTO) {
        try {
            Connection connection = Connect.getInstance().createConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE Bruger SET aktiv = ? WHERE BrugerID = ?;");

            statement.setBoolean(1, brugerDTO.getErAktiv());
            statement.setInt(2, brugerDTO.getBrugerId());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

