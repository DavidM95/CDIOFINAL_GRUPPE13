//package Controllers;
//
//import DAL.DAO.IRåvareDAO;
//import DAL.DAO.RåvareDAO;
//import DAL.DTO.IRåvareDTO;
//import DAL.DTO.RåvareDTO;
//
//import java.sql.SQLException;
//
//public class RåvarerCTRL implements IRåvareDAO {
//
//    public Boolean råvareIdCheck(int råvareId) throws SQLException {
//        IRåvareDAO råvareDAO = new RåvareDAO();
//        IRåvareDTO råvareDTO = råvareDAO.getRåvare(råvareId);
//        if (råvareDTO.getRåvareId() == råvareId) {
//            return true;
//        } else return false;
//    }
//
//
//    public void opretRåvarer(int råvareId, String råvareNavn, String leverandør) throws SQLException {
//        IRåvareDAO råvareDAO = new RåvareDAO();
//        IRåvareDTO råvareDTO = new RåvareDTO(råvareId, råvareNavn, leverandør);
//        if (!råvareIdCheck(råvareId)) {
//            råvareDAO.createRåvare(råvareDTO);
//        } else {
//        }
//
//    }
//
//    public IRåvareDTO seRåvare(int råvareId) throws SQLException {
//        IRåvareDAO råvareDAO = new RåvareDAO();
//        IRåvareDTO råvareDTO = råvareDAO.getRåvare(råvareId);
//        if (råvareIdCheck(råvareId)) {
//            return råvareDTO;
//        } else return null;
//    }
//
//    public void retRåvare(int råvareId, String råvarenavn, String leverandør) throws SQLException {
//        IRåvareDAO råvareDAO = new RåvareDAO();
//        IRåvareDTO råvareDTO = råvareDAO.getRåvare(råvareId);
//        if (råvareIdCheck(råvareId)) {
//            råvareDAO.retRåvare(råvareDTO);
//        } else {
//        }
//    }
//
//
//    @Override
//    public void createRåvare(IRåvareDTO råvareDTO) {
//
//    }
//
//    @Override
//    public RåvareDTO getRåvare(int ID) {
//        return null;
//    }
//
//    @Override
//    public void retRåvare(IRåvareDTO råvareDTO) {
//
//    }
//
//    @Override
//    public void deleteRåvare(int ID) {
//
//    }
//
//}
//
