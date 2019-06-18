package DAL.DAO;

import DAL.Connect;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IConnect;
import DAL.IDALException;

import java.sql.*;
import java.util.List;

public class BrugerDAO implements IBrugerDAO {


    private final String url = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s160601?";
    private final String userName = "user=s160601";
    private final String pass = "password=t08HP36o2H0HGQzFhf4qo";

    public void opretBruger(IBrugerDTO brugerDTO) throws SQLException {


        try  {

            Connection connection = Connect.getInstance().createConnection();
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url + userName + "&" + pass);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Bruger VALUES (?,?,?,?,?);");
//            PreparedStatement roller = connection.prepareStatement("INSERT INTO Roller(brugerId, rolle) VALUES (?,?);");

            statement.setInt(1, brugerDTO.getBrugerId());
            statement.setString(2, brugerDTO.getBrugerNavn());
            statement.setString(3, brugerDTO.getBrugerIni());
            statement.setString(4, brugerDTO.getBrugerPassword());
            statement.setString(5, brugerDTO.getBrugerRole());
            statement.execute();
//            roller.setInt(1,brugerDTO.getBrugerId());

            // Ved ikke om den bare overskriver den allerede gemte rolle. Skal lige testes.
//            for(int i = 0; i < brugerDTO.getRolleliste().size(); i++){
//                roller.setString(2, brugerDTO.getRoller(i));
//                roller.execute();
//            }





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

    public BrugerDTO getBruger(int brugerId) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url + userName + "&" + pass);

                PreparedStatement statement = connection.prepareStatement("SELECT*FROM Bruger WHERE BrugerID = ?;");
//            PreparedStatement roller = connection.prepareStatement("SELECT*FROM Roller WHERE BrugerID = ?;");

                statement.setInt(1, brugerId);

//            roller.setInt(1,ID);

//            ResultSet resultSetRoller = statement.executeQuery();
                ResultSet resultSet = statement.executeQuery();

//            ArrayList rolleliste = new ArrayList();
//            int index = 0;
//            while (resultSetRoller.next()){
//                rolleliste.add(index,resultSetRoller.getString(index+1));
//                index++;
//            }

                BrugerDTO brugerDTO = null;


                IBrugerDTO user = new BrugerDTO(resultSet.getInt("brugerId"), resultSet.getString("brugerNavn"), resultSet.getString("ini"), resultSet.getString("password"), resultSet.getString("rolle"));

//            while(resultSet.next()){
//                brugerDTO = new BrugerDTO(resultSet.getInt("brugerId"), resultSet.getString("brugerNavn"), resultSet.getString("brugerIni"), rolleliste, resultSet.getString("password"));
                return (BrugerDTO) user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<IBrugerDTO> getBrugerList() throws IDALException.DALException {
        return null;
    }


    public void retBruger(IBrugerDTO brugerDTO) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url + userName + "&" + pass);
            PreparedStatement statement = connection.prepareStatement("UPDATE Bruger SET brugerNavn = ?, ini = ?, password = ?, rolle = ? WHERE BrugerID = ?;");
//            PreparedStatement roller = connection.prepareStatement("UPDATE Roller SET rolle = ? WHERE BrugerID = ?;");

            statement.setString(1, brugerDTO.getBrugerNavn());
            statement.setString(2, brugerDTO.getBrugerIni());
            statement.setString(3, brugerDTO.getBrugerPassword());
            statement.setInt(4, brugerDTO.getBrugerId());
            statement.setString(5, brugerDTO.getBrugerRole());
            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();


            //Ved ikke om den overskriver den allerede gemte rolle. Skal lige testes.
//            for(int i = 0; i < brugerDTO.getRolleliste().size(); i++){
//                roller.setString(1,brugerDTO.getRoller(i));
//                roller.setInt(2, brugerDTO.getBrugerID());
//                roller.executeUpdate();
//            }
        }

      /*  public void deleteBruger ( int ID){
            try (Connection connection = DriverManager.getConnection(url + userName + "&" + pass)) {
                PreparedStatement statement = connection.prepareStatement("DELETE * FROM Bruger WHERE BrugerID = ?;");
//            PreparedStatement roller = connection.prepareStatement("DELETE * FROM Roller WHERE BrugerID = ?;");

//            roller.setInt(1,ID);
//            roller.execute();

                statement.setInt(1, ID);
                statement.execute();


            } catch (SQLException e) {
                e.printStackTrace();
            }*/
        }
    }
