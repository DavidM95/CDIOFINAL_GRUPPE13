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

//    @GET
//    public Response seBruger(BrugerDTO brugerDTO) {
////        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
////        brugeradministrationCTRL.LoginChecker(brugerDTO);
//        System.out.println(brugerDTO.getBrugerId());
//        System.out.println(brugerDTO.getBrugerNavn());
//        System.out.println(brugerDTO.getBrugerIni());
//        System.out.println(brugerDTO.getBrugerPassword());
//        System.out.println(brugerDTO.getBrugerRole());
//
//        return Response.ok("hej").build();
//    }



    @POST
    public Response opretUser(BrugerDTO brugerDTO) throws IDALException.DALException, SQLException {
        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
        brugeradministrationCTRL.opretBruger(brugerDTO.getBrugerId(),brugerDTO.getBrugerNavn(), brugerDTO.getBrugerIni(),brugerDTO.getBrugerPassword(), brugerDTO.getBrugerRole());

//        System.out.println(brugerDTO.getBrugerId());
//        System.out.println(brugerDTO.getBrugerNavn());
//        System.out.println(brugerDTO.getBrugerIni());
//        System.out.println(brugerDTO.getBrugerPassword());
//        System.out.println(brugerDTO.getBrugerRole());

        return Response.ok("OK" + brugerDTO.getBrugerNavn() + "velkommen").build();

    }
}

