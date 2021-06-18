package nl.hu.bep.fishysystem.webservices;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/manager")
public class AquariumManagerResource {

    @GET
    public String getOverview() {
        System.out.println("getted");
        return "overview";
    }

}
