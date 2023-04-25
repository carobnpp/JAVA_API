package com.bnpparibas.epita.java.api.collection;

import java.util.PriorityQueue;

public class Voyageur {

    private int numeroVoyageur;
    private String numeroSiege;
    private String nom;

    //public enum Classe {
    //    ECO,
    //    BUSINESS,
    //    PREMIERE;
    //};
    private Classe classe;

    public int getNumeroVoyageur() {
        return numeroVoyageur;
    }

    public String getNumeroSiege() {
        return numeroSiege;
    }

    public String getNom() {
        return nom;
    }

    public Classe getClasse() {
        return classe;
    }

    public Voyageur(int numeroVoyageur, String numeroSiege, String nom, Classe classe) {
        this.numeroVoyageur = numeroVoyageur;
        this.numeroSiege = numeroSiege;
        this.nom = nom;
        this.classe = classe;

    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "numeroVoyageur=" + numeroVoyageur +
                ", numeroSiege=" + numeroSiege +
                ", nom='" + nom + '\'' +
                ", classe=" + classe +
                '}';
    }
}
