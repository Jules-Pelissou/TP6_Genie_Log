package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.HashMap;

public class Scenario {

    // Attributs

    private HashMap<Effet, Integer> listeEffet;
    private ArrayList<Bandeau> bandeauUtilises;


    // Constructeur

    public Scenario() {
        this.listeEffet = new HashMap<Effet, Integer>();
        this.bandeauUtilises = new ArrayList<>();
    }

    // Méthodes

    public void addEffet(Effet e, int repetition){
        this.listeEffet.put(e, repetition);
        e.setListeBandeau(bandeauUtilises);
    }

    public void removeEffet(Effet e){
        this.listeEffet.remove(e);
        e.setListeBandeau(bandeauUtilises);
    }

    public void addRepetition(Effet e, int repetition){
        if (listeEffet.containsKey(e)){
            listeEffet.replace(e, listeEffet.get(e) + repetition);
        }else{
            addEffet(e, repetition);
        }
    }

    public void removeRepetition(Effet e, int repetition){
        if (listeEffet.containsKey(e)){
            if (listeEffet.get(e) - repetition < 0){
                removeEffet(e);
                //Si on retire plus de répétition qu'il n'y en a déjà on supprime l'effet
                // listeEffet.replace(e, 0);
            }else{
                listeEffet.replace(e, listeEffet.get(e) - repetition);
            }
        }
    }

    public void playScenario(){
        for (HashMap.Entry<Effet,Integer> entry : listeEffet.entrySet())
            for (int i = 0; i < bandeauUtilises.size(); i++){
                entry.getKey().applyEffect(bandeauUtilises.get(i));
            }
    }

    // Méthodes pour les bandeaux

    public void ajouterBandeau(Bandeau b){
        bandeauUtilises.add(b);
    }

    public void retirerBandeau(Bandeau b){
        bandeauUtilises.remove(b);
    }

    /*
    public Bandeau getBandeauUtiliseSpe(int index){
        return bandeauUtilises.get(index);
    }

    public Bandeau getFirstBandeau(){
        return bandeauUtilises.get(0);
    }
    */

}
