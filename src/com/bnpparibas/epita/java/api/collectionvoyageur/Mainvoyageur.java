package com.bnpparibas.epita.java.api.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Mainvoyageur {

    public static void main(String[] args) {
        Voyageur voyageur1 = new Voyageur(1,"352","Martin", Classe.ECO);
        Voyageur voyageur2 = new Voyageur(2,"360","Bidule", Classe.ECO);
        Voyageur voyageur3 = new Voyageur(3,"379","Truc", Classe.BUSINESS);
        Voyageur voyageur4 = new Voyageur(4,"385","Machin", Classe.PREMIERE);
        Voyageur voyageur5 = new Voyageur(5,"108","Pilote", Classe.BUSINESS);

        Queue<Voyageur> fileAttenteVoyageur = new PriorityQueue<>(new ComparateurVoyageur());
        fileAttenteVoyageur.add(voyageur1);
        fileAttenteVoyageur.add(voyageur2);
        fileAttenteVoyageur.add(voyageur3);
        fileAttenteVoyageur.add(voyageur4);
        fileAttenteVoyageur.add(voyageur5);

        System.out.println(fileAttenteVoyageur);
        Voyageur premierAppele = fileAttenteVoyageur.poll();
        System.out.println(premierAppele);

        Voyageur deuxiemeAppele = fileAttenteVoyageur.poll();
        System.out.println(deuxiemeAppele);

    }

}
