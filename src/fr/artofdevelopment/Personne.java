package fr.artofdevelopment;

/**
 * Created by jprec on 18/02/2017.
 */
public abstract class Personne {
    protected String prenom;

    private static int count;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public abstract void affiche();
}
