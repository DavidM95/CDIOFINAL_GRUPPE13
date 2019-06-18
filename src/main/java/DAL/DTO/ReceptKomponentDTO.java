package DAL.DTO;

public class ReceptKomponentDTO implements IReceptKomponentDTO {
    int råvareId;
    int nettoVægt;
    float tolerance;




    public ReceptKomponentDTO(int råvareId, int nettoVægt, float tolerance){
        this.råvareId=råvareId;
        this.nettoVægt=nettoVægt;
        this.tolerance=tolerance;
    }
    public int getRåvareId() {
        return råvareId;
    }

    public int getNettoVægt() {
        return nettoVægt;
    }

    public float getTolerance() {
        return tolerance;
    }
    @Override
    public String toString() {
        return "ReceptKomponentDTO{" +
                "råvareId=" + råvareId +
                ", nettoVægt=" + nettoVægt +
                ", tolerance=" + tolerance +
                '}';
    }
}
