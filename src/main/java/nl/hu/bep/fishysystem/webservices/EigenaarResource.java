package nl.hu.bep.fishysystem.webservices;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/eigenaar")
public class EigenaarResource {

    @GET
    @RolesAllowed("eigenaar")
    @Produces
    public Response getEigenaar() {

        return Response.ok().build();
    }

}
