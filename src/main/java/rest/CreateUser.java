package rest;


import Controllers.BrugeradministrationCTRL;
import DAL.DTO.BrugerDTO;
import DAL.IDALException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("createUser")

public class CreateUser {


    @GET
    public Response seAlleBrugere(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.seAlleBrugere(brugerDTO.getBrugerId(),brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(),brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole());


        return Response.ok("hej").build();
    }

    @GET
    @Path("{id}")
    public Response retBruger(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.retBruger(brugerDTO.getBrugerId(),brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(),brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole());


        return Response.ok("hej").build();
    }



    @POST
    public Response opretUser(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.opretBruger(brugerDTO.getBrugerId(),brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(),brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole());


        return Response.ok("Velkommen" + brugerDTO.getBrugerNavn() + "Du har nu oprettet en bruger").build();

    }
}


