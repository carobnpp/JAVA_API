package com.bnpparibas.epita.java.api.collectionvoyageur;

import com.bnpparibas.epita.java.api.collectionvoyageur.Voyageur;

import java.util.Comparator;

public class ComparateurVoyageur implements Comparator<Voyageur> {

    public int compare(Voyageur voyageur1, Voyageur voyageur2) {
        int classComparaison = voyageur1.getClasse().compareTo(voyageur2.getClasse());
        if (classComparaison == 0) {
            int comparaisonSiege = voyageur1.getNumeroSiege().compareTo(voyageur2.getNumeroSiege());
            return comparaisonSiege;
        }
        return classComparaison;
    }
}
