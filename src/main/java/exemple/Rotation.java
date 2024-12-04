package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Rotation implements Effet{

    // Attributs

    private String nom;
    private ArrayList<Bandeau> listeBandeau;

    // Constructeur

    public Rotation(){
        this.nom = "Rotation";
        this.listeBandeau = new ArrayList<>();
    }

    // Méthodes

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setListeBandeau(ArrayList<Bandeau> listeBandeau){
        this.listeBandeau = listeBandeau;
    }

    public void applyEffect(Bandeau b){
        b.setMessage("On va tourner");
        b.sleep(1000);
        b.setMessage("On tourne de 45°...");
        b.setRotation(Math.PI / 2.0f);
        b.sleep(1000);
        b.setRotation(0.0f);
    }

}
