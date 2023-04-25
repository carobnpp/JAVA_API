package com.bnpparibas.epita.java.api.collection;

import java.util.*;

public class Maincollection {

    public static void main(String[] args){
        List<String> maListe = new ArrayList<>();
        maListe.add("element2");
        maListe.add("element4");
        maListe.add("element3");
        maListe.add("element1");
        maListe.add("element5");

        ListeChainecaractere.afficherlaliste(maListe);

        Collections.sort(maListe);
        System.out.println("***************************");
        ListeChainecaractere.afficherlaliste(maListe);

        // ex 4 - collection triee par definition
        Set<Integer> autreListe = new TreeSet<>();
        autreListe.add(2);
        autreListe.add(4);
        autreListe.add(3);
        autreListe.add(1);
        autreListe.add(5);

        System.out.println("***************************");
        ListeChainecaractere.afficherlaliste(autreListe);

        Collections.sort(maListe);
        System.out.println("***************************");
        ListeChainecaractere.afficherlaliste(autreListe);

        //ex 5 - modeliser tableau à 2 dimensions avec implementation interface List
        List<List<Integer>> maListedeListe = new ArrayList<>();

    }

}
