package rest;


import Controllers.BrugeradministrationCTRL;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("UserService")

public class UserService implements IDALException {


    @GET
    @Path("seallebrugere")
    public List<BrugerDTO> seAlleBrugere(BrugerDTO brugerDTO) throws DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        return brugeradministrationCTRL.brugerListe();
    }

    @GET
    @Path("{id}")
    public IBrugerDTO seBruger(@PathParam("id") int id) throws DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        return brugeradministrationCTRL.seBruger(id);
    }


    @POST
    @Path("/update/")
    public Response retBruger(BrugerDTO brugerDTO) throws DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.retBruger(brugerDTO);
        return Response.ok().build();
    }


    @POST
    public Response opretBruger(BrugerDTO brugerDTO) throws DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.opretBruger(brugerDTO.getBrugerId(), brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(), brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole(), brugerDTO.getErAktiv());
        return Response.ok("Velkommen" + brugerDTO.getBrugerNavn() + "Du har nu oprettet en bruger").build();
    }


    @POST
    @Path("/setBrugerAktivitet/{id}")
    public void setBrugerAktivitet(@PathParam("id") int id) throws DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.setBrugerAktivitet(id);
    }
}


