//import DAL.Connect;
//import DAL.DAO.*;
//import DAL.DTO.*;
//import DAL.IConnect;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Main {
//
//    public static void main(String[] args) throws SQLException {
//
//        IConnect connect = new Connect();
//
////        IIngrediensDAO ingrediensDAO = new IngrediensDAO();
//        IBrugerDAO brugerDAO = new BrugerDAO();
////        IRåvareDAO råvareDAO = new RåvareDAO();
////        IOpskriftDAO opskriftDAO = new OpskriftDAO();
////        IProduktionDAO produktionDAO = new ProduktionDAO();
////
////        IIngrediensDTO ingrediensDTO;
//        IBrugerDTO brugerDTO=null;
////        IProduktionDTO produktionDTO;
////        IOpskriftDTO opskriftDTO;
////        IRåvareDTO råvareDTO;
//
//        connect.createConnection();
//
//        ArrayList<String> admin = new ArrayList<String>();
//        admin.add("Admin");
//
//        ArrayList<String> laborant = new ArrayList<String>();
//        laborant.add("Laborant");
//
//        ArrayList<String> produktionsleder = new ArrayList<String>();
//        produktionsleder.add("Produktionsleder");
//
//        ArrayList<String> farmaceut = new ArrayList<String>();
//        farmaceut.add("Farmaceut");
//
//        Date date = new Date();
//        Date enddate = new Date();
//
//
////        brugerDAO.opretBruger(connect.getConnection(),brugerDTO = new BrugerDTO(1,"Bente","BE", admin, "hejhej"));
////        brugerDAO.opretBruger(connect.getConnection(),brugerDTO = new BrugerDTO(2,"PeterP","PP", laborant, "hejhej12"));
//        brugerDAO.opretBruger(connect.getConnection(),brugerDTO = new BrugerDTO(3,"JakobA","JA", farmaceut, "hejhej22"));
//        System.out.println("oprettet følgende bruger: " + brugerDTO);
//
//
////        opskriftDAO.createOpskrift(connect.getConnection(),opskriftDTO = new OpskriftDTO(1,"opskrift", date,3));
////        opskriftDAO.createOpskrift(connect.getConnection(),opskriftDTO = new OpskriftDTO(2,"dank",date,3));
////        produktionDAO.createProduktion(connect.getConnection(),produktionDTO = new ProduktionDTO(1,20000,"igang",2,opskriftDTO.getOpskriftID(), date,enddate));
////        ingrediensDAO.createIngrediens(connect.getConnection(),ingrediensDTO = new IngrediensDTO(1,"CarbonDioxid",4,1));
////        ingrediensDAO.createIngrediens(connect.getConnection(),ingrediensDTO = new IngrediensDTO(2,"salt",5,2));
////        råvareDAO.createRåvare(connect.getConnection(),råvareDTO = new RåvareDTO(1,1,"CarbonDioxid",1,false));
//
////        System.out.println(brugerDAO.getBruger(connect.getConnection(),1).getBrugerNavn());
////        System.out.println(opskriftDAO.getOpskrift(connect.getConnection(),1));
////        produktionDAO.getProduktion(connect.getConnection(),1);
////        System.out.println(ingrediensDAO.getIngrediens(connect.getConnection(),1).getIngrediensID());
////        råvareDAO.getRåvare(connect.getConnection(),1);
//
// //       brugerDAO.updateBruger(connect.getConnection(),brugerDTO = new BrugerDTO(1,"bente","BE",laborant,"nejnej"));
////        opskriftDAO.updateOpskrift(connect.getConnection(),opskriftDTO = new OpskriftDTO(1,"Smertestillende opskrift",date,3));
////        produktionDAO.updateProduktion(connect.getConnection(),produktionDTO = new ProduktionDTO(1,20,"igang",2,1,date,enddate));
////        ingrediensDAO.updateIngrediens(connect.getConnection(),ingrediensDTO = new IngrediensDTO(1,"CarbonDioxid",300,1));
////        råvareDAO.updateRåvare(connect.getConnection(),råvareDTO = new RåvareDTO(1,2,"Uran",2,false));
////
////        produktionDAO.endProduktion(connect.getConnection(),produktionDTO = new ProduktionDTO(1,20000,"Færdig",2,1,date,enddate));
////
////
////        brugerDAO.getBruger(connect.getConnection(),1);
////        opskriftDAO.getOpskrift(connect.getConnection(),1);
////        produktionDAO.getProduktion(connect.getConnection(),1);
////        ingrediensDAO.getIngrediens(connect.getConnection(),1);
////        råvareDAO.getRåvare(connect.getConnection(),1);
////
////        brugerDAO.deleteBruger(connect.getConnection(),1);
////        råvareDAO.deleteRåvare(connect.getConnection(),1);
////        ingrediensDAO.deleteIngrediens(connect.getConnection(),1);
////        opskriftDAO.deleteOpskrift(connect.getConnection(),1);
//
//
//        connect.closeConnection();
//    }
//}
