package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public interface Effet {

    // Attributs

    String nom = "";
    ArrayList<Bandeau> listeBandeau = new ArrayList();

    // Méthodes

    public String getNom();
    public void setNom(String nom);
    public void setListeBandeau(ArrayList<Bandeau> listeBandeau);
    public void applyEffect(Bandeau bandeau);

}
