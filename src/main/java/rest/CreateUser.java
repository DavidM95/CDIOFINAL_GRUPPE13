package rest;


import Controllers.BrugeradministrationCTRL;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;
import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("createUser")

public class CreateUser {


    @GET
    @Path("seallebrugere")
    public Response seAlleBrugere(BrugerDTO brugerDTO) throws SQLException, IDALException.DALException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.brugerListe().toString();
        return Response.ok("hej").build();
    }

    @GET
    @Path("{id}")
    public IBrugerDTO seBruger(@PathParam("id") int id)  throws IDALException.DALException, SQLException {
        System.out.println("jeg er her");
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        System.out.println(brugeradministrationCTRL.seBruger(id));
        return brugeradministrationCTRL.seBruger(id);
    }


//    @GET
//    @Path("{id}")
//    public Response retBruger(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
//        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
//        brugeradministrationCTRL.retBruger(brugerDTO.getBrugerId(), brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(), brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole());
//
//        return Response.ok("hej").build();
//    }


    @POST
    public Response opretBruger(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.opretBruger(brugerDTO.getBrugerId(), brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(), brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole());

        return Response.ok("Velkommen" + brugerDTO.getBrugerNavn() + "Du har nu oprettet en bruger").build();

    }
}


