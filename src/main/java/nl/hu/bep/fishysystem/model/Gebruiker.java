package nl.hu.bep.fishysystem.model;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public class Gebruiker implements Principal {
    private String username;
    private String password;
    private String role;
    private Eigenaar eigenaar;
    private AquariumManager aqmanager;

    private static List<Gebruiker> alleGebruikers;

    static {
        alleGebruikers = new ArrayList<>();
        alleGebruikers.add(new Gebruiker("Beau", "0294", "manager"));
        Gebruiker pinda = new Gebruiker("Pinda", "0294", "eigenaar");
        Eigenaar pindameneer = new Eigenaar("pinda", "noot");
        pinda.setEigenaar(pindameneer);
        alleGebruikers.add(pinda);
    }

    public Gebruiker(String username, String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static Gebruiker validateLogin(String username, String password) {
        for (Gebruiker g : alleGebruikers) {
            if (g.username.equals(username) && g.password.equals(password)) {
                return g;
            }
        }
        return null;
    }

    public static Gebruiker getGebruikerByName(String username) {
        for (Gebruiker g : alleGebruikers) {
            if (g.username.equals(username)) {
                return g;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public String getRole() {
        return this.role;
    }

    public void setEigenaar(Eigenaar eigenaar) {
        this.eigenaar = eigenaar;
    }

    public Eigenaar getEigenaar() {
        return eigenaar;
    }
}
