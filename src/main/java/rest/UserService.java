package rest;


import Controllers.BrugeradministrationCTRL;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;
import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("UserService")

public class UserService {


    @GET
    @Path("seallebrugere")
    public List<BrugerDTO> seAlleBrugere(BrugerDTO brugerDTO) throws SQLException, IDALException.DALException {
        System.out.println("Nu er jeg i se alle brugere");
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        return brugeradministrationCTRL.brugerListe();
//        return Response.ok("hej").build();
    }

    @GET
    @Path("{id}")
    public IBrugerDTO seBruger(@PathParam("id") int id) throws IDALException.DALException, SQLException {
        System.out.println("jeg er her");
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        System.out.println(brugeradministrationCTRL.seBruger(id));
        return brugeradministrationCTRL.seBruger(id);
    }


//    @POST
//    @Path("/update/{id}")
//    public Response retBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword, String brugerRolle, boolean erAktiv) throws IDALException.DALException, SQLException {
//        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
//        BrugerDTO brugerDTO = new BrugerDTO();
//        brugeradministrationCTRL.retBruger(brugerId,brugerNavn,brugerIni,brugerPassword,brugerRolle,erAktiv);
//        brugerDTO.setBrugerId();
//
//        return Response.ok("hej").build();
//    }


    @POST
    public Response opretBruger(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.opretBruger(brugerDTO.getBrugerId(), brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(), brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole(), brugerDTO.getErAktiv());

        return Response.ok("Velkommen" + brugerDTO.getBrugerNavn() + "Du har nu oprettet en bruger").build();
    }


    @POST
    @Path("/setBrugerAktivitet/{id}")
    public void setBrugerAktivitet(@PathParam("id") int id) throws SQLException, IDALException.DALException {
        System.out.println("kommer jeg her ind");
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.setBrugerAktivitet(id);
    }
}


