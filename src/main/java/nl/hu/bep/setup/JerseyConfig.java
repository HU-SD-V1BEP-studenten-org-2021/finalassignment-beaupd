package nl.hu.bep.setup;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("nl/hu/bep/fishysystem/webservices", "nl/hu/bep/fishysystem/security");
        register(RolesAllowedDynamicFeature.class);
    }
}