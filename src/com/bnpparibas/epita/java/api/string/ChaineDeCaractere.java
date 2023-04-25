package com.bnpparibas.epita.java.api.string;

public final class ChaineDeCaractere {


    public static String TransformerMajuscule(String phrase) {
        return phrase.toUpperCase();
    }

    public static int calculNombreCaracteresa(String phrase) {

        int nombreCaracteresa = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a') {
                nombreCaracteresa++;
            }
        }
        return nombreCaracteresa;
    }

        public static String transformercaraen4 (String phrase){
           return phrase.replace('a', '4');
        }

    public static String supprimercar5et10 (String phrase){
        return (phrase.substring(0,5) + phrase.substring(11,phrase.length()));
    }

}

