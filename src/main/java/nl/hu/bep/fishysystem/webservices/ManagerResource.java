package nl.hu.bep.fishysystem.webservices;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("manager")
public class ManagerResource {

    @GET
    @RolesAllowed("manager")
    public Response getAlleEigenaren() {
        return Response.ok().build();
    }
}
