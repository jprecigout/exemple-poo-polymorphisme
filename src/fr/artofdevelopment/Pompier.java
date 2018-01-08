package fr.artofdevelopment;

/**
 * Created by jprec on 18/02/2017.
 */
public class Pompier extends Personne {

    public Pompier(String prenom) {
        super(prenom);
    }

    public void affiche() {
        System.out.println(this.prenom + ", profession : Pompier" );
    }
}
