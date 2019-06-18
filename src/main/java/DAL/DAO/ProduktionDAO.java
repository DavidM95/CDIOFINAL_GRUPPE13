//package DAL.DAO;
//
//import DAL.DTO.IProduktionDTO;
//import DAL.DTO.ProduktionDTO;
//
//import java.sql.*;
//
//public class ProduktionDAO implements IProduktionDAO {
//
//    public void createProduktion(Connection connection, IProduktionDTO produktionDTO) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("INSERT into Produktion values(?,?,?,?,?,?,?);");
//
//            Date sqlDateStart = new Date(produktionDTO.getStartDato().getTime());
//            Date sqlDateSlut = new Date(produktionDTO.getSlutDato().getTime());
//
//            statement.setInt(1, produktionDTO.getProduktionsID());
//            statement.setInt(2, produktionDTO.getOpskriftID());
//            statement.setInt(3, produktionDTO.getProduktionsmængde());
//            statement.setString(4, produktionDTO.getProduktionsstatus());
//            statement.setDate(5, sqlDateStart);
//            statement.setDate(6, sqlDateSlut);
//            statement.setInt(7, produktionDTO.getBrugerID());
//
//            statement.execute();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public IProduktionDTO getProduktion(Connection connection, int ID) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Produktion WHERE ProduktionsID = ?;");
//
//            statement.setInt(1, ID);
//
//            ResultSet resultSet = statement.executeQuery();
//
//            IProduktionDTO produktionDTO = null;
//
//            while (resultSet.next()){
//                produktionDTO = new ProduktionDTO(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(4), resultSet.getInt(3),resultSet.getInt(7), resultSet.getDate(5), resultSet.getDate(6));
//            }
//
//            return produktionDTO;
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public void updateProduktion(Connection connection, IProduktionDTO produktionDTO) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("UPDATE Produktion SET ProduktionsID = ?, OpskriftID = ?, Produktionsmængde = ?, Produktionsstatus = ?, Startdato = ?, Slutdato = ?, BrugerID = ? WHERE ProduktionsID = ?;");
//
//            Date sqlDateStart = new Date(produktionDTO.getStartDato().getTime());
//            Date sqlDateSlut = new Date(produktionDTO.getSlutDato().getTime());
//
//            statement.setInt(1, produktionDTO.getProduktionsID());
//            statement.setInt(2, produktionDTO.getOpskriftID());
//            statement.setInt(3, produktionDTO.getProduktionsmængde());
//            statement.setString(4, produktionDTO.getProduktionsstatus());
//            statement.setDate(5, sqlDateStart);
//            statement.setDate(6, sqlDateSlut);
//            statement.setInt(7, produktionDTO.getBrugerID());
//            statement.setInt(8, produktionDTO.getProduktionsID());
//
//            statement.executeUpdate();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public void endProduktion(Connection connection, IProduktionDTO produktionDTO) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("UPDATE Produktion SET Produktionsstatus = ?, Slutdato = ?  WHERE ProduktionsID = ?;");
//
//            Date sqlDateslut = new Date(produktionDTO.getSlutDato().getTime());
//
//            statement.setString(1,produktionDTO.getProduktionsstatus());
//            statement.setDate(2,sqlDateslut);
//            statement.setInt(3, produktionDTO.getBrugerID());
//
//            statement.executeUpdate();
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteProduktion(Connection connection, int ID) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("DELETE FROM Produktion WHERE = ?;");
//
//            statement.setInt(1,ID);
//
//            statement.execute();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//}
