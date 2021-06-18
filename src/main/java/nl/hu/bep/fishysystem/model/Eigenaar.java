package nl.hu.bep.fishysystem.model;

import java.util.ArrayList;

public class Eigenaar {
    private String voornaam;
    private String achternaam;
    private ArrayList<Aquarium> aquaria = new ArrayList<>();
    private ArrayList<Toebehoren> toebehoren = new ArrayList<>();

    public Eigenaar(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public void setAquaria(ArrayList<Aquarium> aqs) {
        this.aquaria = aqs;
    }

    public ArrayList<Aquarium> getAquaria() {
        return aquaria;
    }

    public void addAquarium(Aquarium aq) {
        if (!aquaria.contains(aq)){
            aquaria.add(aq);
        }
    }

//    public boolean removeAquarium(String naam) {
//        Aquarium aq = Aquarium.
//    }

    @Override
    public boolean equals(Object obj) {
        Eigenaar eg = (Eigenaar) obj;
        if(this.voornaam == eg.voornaam && this.achternaam == eg.achternaam) return true;
        return false;
    }

    public void setToebehoren(ArrayList<Toebehoren> tbhs) {
        this.toebehoren = tbhs;
    }

    public ArrayList<Toebehoren> getToebehoren() {
        return toebehoren;
    }

    public void addToebehoren(Toebehoren tbh) {
        if (!toebehoren.contains(tbh)){
            toebehoren.add(tbh);
        }
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }
}
