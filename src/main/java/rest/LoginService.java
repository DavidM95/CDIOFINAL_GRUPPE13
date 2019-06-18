package rest;


import DAL.DTO.LoginDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("loginService")

public class LoginService {

//    @GET
//    public Response getHelloWorld() {
//        return Response.ok("hej").build();
//    }

    @POST
    public Response loginUser(LoginDTO loginDTO) {
//        BrugeradministrationCTRL brugeradministrationCTRL = new BrugeradministrationCTRL();
//        brugeradministrationCTRL.LoginChecker(brugerId, brugerPassword);
        System.out.println(loginDTO.getBrugerId());
        System.out.println(loginDTO.getBrugerPassword());
            return Response.ok("Velkommen"+ loginDTO.getBrugerId() + " , du er nu logget ind").build();

}
    /*}


    @GET
    public String helloworld() {
        return "Hej verden!";
    }*/
}

