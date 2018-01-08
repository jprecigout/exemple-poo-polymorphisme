package fr.artofdevelopment;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] argv) {
        List<Personne> listPersonne = new ArrayList<>();
        listPersonne.add(new Medecin("Paul"));
        listPersonne.add(new Pompier("Jean"));
        listPersonne.add(new Medecin("Pierre"));

        listPersonne.stream().forEach(personne -> personne.affiche());
    }
}