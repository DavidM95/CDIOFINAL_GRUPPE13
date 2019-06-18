//package DAL.DTO;
//
//import java.util.Date;
//
//public class ProduktionDTO implements IProduktionDTO {
//
//    int produktionsID;
//    int produktionsmængde;
//    Date startdato;
//    Date slutdato;
//    String produktionsstatus;
//
//    int brugerID;
//    int opskriftID;
//
//    public ProduktionDTO(int produktionsID, int produktionsmængde, String produktionsstatus, int brugerID, int opskriftID, Date startdato, Date slutdato){
//
//        this.brugerID = brugerID;
//        this.opskriftID = opskriftID;
//        this.produktionsID = produktionsID;
//        this.produktionsmængde = produktionsmængde;
//        this.produktionsstatus = produktionsstatus;
//        this.startdato = startdato;
//        this.slutdato = slutdato;
//
//    }
//
//    public int getProduktionsID() {
//        return this.produktionsID;
//    }
//
//    public int getProduktionsmængde() {
//        return this.produktionsmængde;
//    }
//
//    public String getProduktionsstatus() {
//        return this.produktionsstatus;
//    }
//
//    public int getBrugerID() {
//        return this.brugerID;
//    }
//
//    public int getOpskriftID() {
//        return this.opskriftID;
//    }
//
//    public Date getStartDato() {
//        return this.startdato;
//    }
//
//    public Date getSlutDato() {
//        return this.slutdato;
//    }
//
//    @Override
//    public String toString() {
//        return "ProduktionDTO{" +
//                "produktionsID=" + produktionsID +
//                ", produktionsmængde=" + produktionsmængde +
//                ", startdato=" + startdato +
//                ", slutdato=" + slutdato +
//                ", produktionsstatus='" + produktionsstatus + '\'' +
//                ", brugerID=" + brugerID +
//                ", opskriftID=" + opskriftID +
//                '}';
//    }
//}
