package exemple;

import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class CouleurFont implements Effet{

    // Attributs

    private String nom;
    private ArrayList<Bandeau> listeBandeau;
    private ArrayList<Color> listeCouleur;

    // Constructeur

    public CouleurFont(ArrayList<Color> listeCouleur) {
        this.nom = "Changement de couleurs de police";
        this.listeBandeau = new ArrayList<>();
        this.listeCouleur = listeCouleur;
    }

    public CouleurFont() {
        this.nom = "Changement de couleurs de police";
        this.listeBandeau = new ArrayList<>();
        this.listeCouleur = new ArrayList<>();
        listeCouleur.add(Color.YELLOW);
        listeCouleur.add(Color.BLUE);
        listeCouleur.add(Color.RED);
        listeCouleur.add(Color.GREEN);
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

        Font font = b.getFont();
        Color back = b.getBackground();
        Color fore = b.getForeground();

        for (Color c : listeCouleur) {
            b.setMessage("On va changer de couleur");
            b.sleep(1000);
            b.setForeground(c);
            b.sleep(1000);
        }
    }
}
