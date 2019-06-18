//package DAL.DTO;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import DAL.DTO.ReceptKomponentDTO;
//
//public class ReceptDTO implements IReceptDTO  {
//
//    int receptId;
//    String receptNavn;
//    Array[] receptKomponent;
//
//
//
//    public ReceptDTO(int receptId, String receptNavn, ArrayList<ReceptKomponentDTO> receptKomponenter){
//
//        this.receptId = receptId;
//        this.receptNavn = receptNavn;
//        this.receptKomponent=receptKomponenter;
//    }
//
//    public int getReceptId() {
//        return this.receptId;
//    }
//
//    public String getReceptNavn() {
//        return this.receptNavn;
//    }
//
//    public ArrayList<ReceptKomponentDTO> getReceptKomponent() {
//        return receptKomponent;
//    }
//
//    @Override
//    public String toString() {
//        return "ReceptDTO{" +
//                "receptId=" + receptId +
//                ", receptNavn='" + receptNavn + '\'' +
//                '}';
//    }
//
//}
