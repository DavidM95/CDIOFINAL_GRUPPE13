package DAL.DTO;

public class RåvareDTO implements IRåvareDTO{

    int råvareId;
    String råvarenavn;
    String leverandør;

    public RåvareDTO(int råvareId, String råvarenavn, String leverandør){

        this.råvareId = råvareId;
        this.råvarenavn = råvarenavn;
        this.leverandør = leverandør;
    }


    public int getRåvareId() {
        return this.råvareId;
    }

    public String getRåvarenavn() {
        return this.råvarenavn;
    }

    public String getLeverandør() {
        return this.leverandør;
    }

    @Override
    public String toString() {
        return "RåvareDTO{" +
                ", råvareId=" + råvareId +
                ", råvarenavn='" + råvarenavn + '\'' +
                ", leverandør=" + leverandør +
                '}';
    }
}