package DAL.DTO;



public class LoginDTO  implements ILoginDTO{
    private int brugerId;
    private String brugerPassword;

    public LoginDTO() {

    }

    public LoginDTO(int brugerId, String brugerPassword){

        this.brugerId = brugerId;
        this.brugerPassword = brugerPassword;

    }


    @Override
    public int getBrugerId() {return this.brugerId; }

    @Override
    public String getBrugerPassword(){return this.brugerPassword;}


    @Override
    public String toString() {
        return "BrugerDTO{" +
                "brugerId=" + brugerId +
                ", brugerPassword=" + brugerPassword +
                '}';
    }
}
