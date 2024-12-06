package exemple;

import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Zoom implements Effet{

    // Attributs

    private String nom;
    private ArrayList<Bandeau> listeBandeau;
    private String texteAZoom;

    // Constructeur

    public Zoom(String texteAZoom) {
        this.nom = "Zoom texte";
        this.listeBandeau = new ArrayList<>();
        this.texteAZoom = texteAZoom;
    }

    public Zoom() {
        this.nom = "Zoom texte";
        this.listeBandeau = new ArrayList<>();
        this.texteAZoom = "Zoom";
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

        b.setMessage("On va zoomer");
        b.sleep(1000);
        b.setMessage(texteAZoom);
        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            b.sleep(100);
        }
        b.sleep(1000);
    }
}
