package nl.hu.bep.fishysystem.model;

import java.util.ArrayList;

public class AquariumManager {
    private String installatienaam;
    private static ArrayList<Toebehoren> alleToebehoren = new ArrayList<>();
    private static ArrayList<Eigenaar> alleEigenaren = new ArrayList<>();
    private static ArrayList<Bewoner> alleBewoners = new ArrayList<>();

    public AquariumManager(String installatienaam) {
        this.installatienaam = installatienaam;
    }

    public ArrayList<Toebehoren> getAlleToebehoren(){
        return alleToebehoren;
    }

    public void setAlleToebehoren(ArrayList<Toebehoren> alleToebehoren){
        this.alleToebehoren = alleToebehoren;
    }

    public void addToebehoren(Toebehoren tbh){
        if(!alleToebehoren.contains(tbh)){
            alleToebehoren.add(tbh);
        }
    }
    public ArrayList<Eigenaar> getAlleEigenarenn(){
        return alleEigenaren;
    }

    public void setAlleEigenaren(ArrayList<Eigenaar> alleEigenaren){
        this.alleEigenaren = alleEigenaren;
    }

    public void addEigenaar(Eigenaar eig){
        if(!alleEigenaren.contains(eig)){
            alleEigenaren.add(eig);
        }
    }
    public ArrayList<Bewoner> getAlleBewoners(){
        return alleBewoners;
    }

    public void setAlleBewoners(ArrayList<Bewoner> alleBewoners){
        this.alleBewoners = alleBewoners;
    }

    public void addBewoner(Bewoner bew){
        if(!alleBewoners.contains(bew)){
            alleBewoners.add(bew);
        }
    }

    public static void verwijderEigenaar(Eigenaar eig){
        if(alleEigenaren.contains(eig)){
            alleEigenaren.remove(eig);
        }
        alleEigenaren.remove(eig);
    }
}
