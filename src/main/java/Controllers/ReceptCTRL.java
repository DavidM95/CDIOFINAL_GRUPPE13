//package Controllers;
//
//import DAL.DAO.IReceptDAO;
//import DAL.DAO.ReceptDAO;
//import DAL.DTO.IReceptDTO;
//import DAL.DTO.ReceptDTO;
//
//import java.sql.SQLException;
//
//public class ReceptCTRL {
//
//    public boolean ReceptIdCheck(int receptId) throws SQLException {
//        IReceptDAO receptDAO = new ReceptDAO();
//        IReceptDTO receptDTO = receptDAO.getRecept(receptId);
//        if (receptDTO.getReceptId() == receptId){
//            return true;
//        }else return false;
//    }
//
//}
