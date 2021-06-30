package nl.hu.bep.fishysystem.model;

public class Aquarium {
    private String naam;
    private int lengte;
    private int breedte;
    private int hoogte;
    private String bodemsoort;
    private String watersoort;

    public Aquarium(String naam, int lengte, int breedte, int hoogte, String bodemsoort, String watersoort) {
        this.naam = naam;
        this.lengte = assertPositief(lengte);
        this.breedte = assertPositief(breedte);
        this.hoogte = assertPositief(hoogte);
        this.bodemsoort = bodemsoort;
        this.watersoort = watersoort;
    }

    public int assertPositief(int getal) {
        if (getal < 0) {
            throw new IllegalArgumentException("De getalen van de dimensies van het aquarium moeten positief zijn.");
        }
        return getal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        return true;
    }
}
