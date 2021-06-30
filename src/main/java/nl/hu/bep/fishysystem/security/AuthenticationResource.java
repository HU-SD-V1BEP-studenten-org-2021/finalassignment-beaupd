package nl.hu.bep.fishysystem.security;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import nl.hu.bep.fishysystem.model.Gebruiker;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.security.Key;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static nl.hu.bep.fishysystem.model.Gebruiker.validateLogin;

@Path("/auth")
public class AuthenticationResource {

    final static public Key key = MacProvider.generateKey();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response authenticateUser(@FormParam("username") String name, @FormParam("password") String pass) {

        try {
            Gebruiker gebruiker = validateLogin(name, pass);
            String role = gebruiker.getRole();
            if (role == null) throw new IllegalArgumentException("No User found");

            String token = createJWTtoken(name, role);
            Map<String,String> JWT = new HashMap<>();
            JWT.put("JWT",  token);
            JWT.put("role", role);
            return Response.ok(JWT).build();
        } catch (JwtException | IllegalArgumentException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

    }

    private String createJWTtoken(String username, String role){
        Calendar expiration = Calendar.getInstance();
        expiration.add(Calendar.MINUTE, 10);

        return Jwts.builder()
                .setSubject(username)
                .setExpiration(expiration.getTime())
                .claim("role", role)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();

    }
}
