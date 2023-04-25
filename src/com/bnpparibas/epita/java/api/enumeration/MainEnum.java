package com.bnpparibas.epita.java.api.enumeration;

public class MainEnum {
    public static void main(String[] args) {

    // on a récupéré tous les elements de l'enumeration
        JourdelaSemaine[] jours = JourdelaSemaine.values();


    // le name fait partie des methodes de l'enum - puis les autres données qu'on a mis en getter dans l'enum
        for (JourdelaSemaine jour : jours) {
            System.out.println("jour: " + jour.name() + " c'est un week-end: " + jour.isWe() +
                    " et je suis : " + jour.getSmiley());
        }

        System.out.println (JourdelaSemaine.JEUDI.compareTo(JourdelaSemaine.SAMEDI));


    }
}
