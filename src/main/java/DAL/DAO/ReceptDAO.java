//package DAL.DAO;
//
//import DAL.Connect;
//import DAL.DTO.IReceptDTO;
//import DAL.DTO.ReceptDTO;
//
//import java.sql.*;
//
//public class ReceptDAO implements IReceptDAO {
//    public void opretRecept(IReceptDTO receptDTO) {
//
//        try {
//            Connection connection = Connect.getInstance().createConnection();
//            PreparedStatement statement = connection.prepareStatement("INSERT into Opskrift values(?,?,?);");
//
//            statement.setInt(1, receptDTO.getReceptId());
//            statement.setString(2, receptDTO.getReceptNavn());
//            statement.setArray(3, receptDTO.getReceptKomponent());
//            statement.execute();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public IReceptDTO getRecept(int Id) {
//        try {
//            Connection connection = Connect.getInstance().createConnection();
//
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Ingrediens WHERE ReceptId = ?;");
//
//            statement.setInt(1, Id);
//
//            ResultSet resultSet = statement.executeQuery();
//
//            IReceptDTO receptDTO = null;
//
//            while (resultSet.next()) {
//                receptDTO = new ReceptDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getArray(3));
//            }
//
//            return receptDTO;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    public void updateOpskrift(IReceptDTO opskriftDTO) {
//        try {
//              Connection connection = Connect.getInstance().createConnection();
//
//            PreparedStatement statement = connection.prepareStatement("UPDATE Opskrift SET OpskriftID = ?, Opskriftnavn = ?, Dato = ?, BrugerID = ? WHERE OpskriftID = ?;");
//
//            java.sql.Date sqlDate = new java.sql.Date(opskriftDTO.getDato().getTime());
//
//            statement.setInt(1, opskriftDTO.getOpskriftID());
//            statement.setString(2, opskriftDTO.getOpskriftNavn());
//            statement.setDate(3, sqlDate);
//            statement.setInt(4, opskriftDTO.getBrugerID());
//            statement.setInt(5, opskriftDTO.getOpskriftID());
//
//            statement.executeUpdate();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteOpskrift( int ID) {
//        try {
//            Connection connection = Connect.getInstance().createConnection();
//
//            PreparedStatement statement = connection.prepareStatement("DELETE from Opskrift WHERE OpskriftID  = ?;");
//            PreparedStatement ingrediens = connection.prepareStatement("DELETE FROM Ingrediens WHERE OpskriftID = ?;");
//
//            ingrediens.setInt(1,ID);
//            statement.setInt(1, ID);
//
//            ingrediens.execute();
//            statement.execute();
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//}
