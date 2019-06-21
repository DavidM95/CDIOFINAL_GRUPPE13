package rest;


import DAL.DTO.LoginDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("loginService")

public class LoginService {


/**
 *
 * Kan bruges til eksamen
 **/
    @POST
    public Response loginUser(LoginDTO loginDTO) {
//        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
//        brugeradministrationCTRL.LoginChecker(brugerId, brugerPassword);

        return Response.ok("Velkommen," + loginDTO.getBrugerId() + " du er nu logget ind som Admin").build();

    }
}

