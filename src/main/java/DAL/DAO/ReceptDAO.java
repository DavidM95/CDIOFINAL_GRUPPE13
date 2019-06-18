//package DAL.DAO;
//
//import DAL.DTO.IReceptDTO;
//import DAL.DTO.ReceptDTO;
//import DAL.IConnect;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class ReceptDAO implements IReceptDAO, IConnect {
//    public void opretRecept( IReceptDTO receptDTO) throws SQLException {
//        createConnection();
//        Connection connection = getConnection();
//        try {
//
//            PreparedStatement statement = connection.prepareStatement("INSERT into Opskrift values(?,?,?);");
//
//            statement.setInt(1, receptDTO.getReceptId()) ;
//            statement.setString(2, receptDTO.getReceptNavn());
//            statement.setArray(3, receptDTO.getReceptKomponent());
//            statement.execute();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection();
//    }
//
//    public IReceptDTO getRecept(int Id) throws SQLException {
//        try {
//            createConnection();
//            Connection connection = getConnection();
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Ingrediens WHERE ReceptId = ?;");
//
//            statement.setInt(1, Id);
//
//            ResultSet resultSet = statement.executeQuery();
//
//            IReceptDTO receptDTO = null;
//
//            while (resultSet.next()){
//                receptDTO = new ReceptDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getArray(3));
//            }
//
//            return receptDTO;
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection();
//        return null;
//    }
//
//    @Override
//    public void createConnection() throws SQLException {
//
//    }
//
//    @Override
//    public Connection getConnection() {
//        return null;
//    }
//
//    @Override
//    public void closeConnection() throws SQLException {
//
//    }
//
////    public void updateOpskrift(Connection connection, IReceptDTO opskriftDTO) {
////        try {
////            PreparedStatement statement = connection.prepareStatement("UPDATE Opskrift SET OpskriftID = ?, Opskriftnavn = ?, Dato = ?, BrugerID = ? WHERE OpskriftID = ?;");
////
////            java.sql.Date sqlDate = new java.sql.Date(opskriftDTO.getDato().getTime());
////
////            statement.setInt(1, opskriftDTO.getOpskriftID());
////            statement.setString(2, opskriftDTO.getOpskriftNavn());
////            statement.setDate(3, sqlDate);
////            statement.setInt(4, opskriftDTO.getBrugerID());
////            statement.setInt(5, opskriftDTO.getOpskriftID());
////
////            statement.executeUpdate();
////
////        } catch (SQLException e){
////            e.printStackTrace();
////        }
////    }
////
////    public void deleteOpskrift(Connection connection, int ID) {
////        try {
////            PreparedStatement statement = connection.prepareStatement("DELETE from Opskrift WHERE OpskriftID  = ?;");
////            PreparedStatement ingrediens = connection.prepareStatement("DELETE FROM Ingrediens WHERE OpskriftID = ?;");
////
////            ingrediens.setInt(1,ID);
////            statement.setInt(1, ID);
////
////            ingrediens.execute();
////            statement.execute();
////        } catch (SQLException e){
////            e.printStackTrace();
////        }
////    }
//}
