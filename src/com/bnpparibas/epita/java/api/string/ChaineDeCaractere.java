package com.bnpparibas.epita.java.api.string;

public final class ChaineDeCaractere {


    public static String TransformerMajuscule (String phrase){
        return phrase.toUpperCase();
    }
    public static int calculNombreCaracteresa(String phrase) {

        int nombreCaracteresa = 0;
        int i;

        for (i=0; i <= phrase.length(); i++);{
            if  (phrase.charAt(i) =='a') ;
            {
                nombreCaracteresa++;
            }
    }
        return nombreCaracteresa;
}

    public static int transformercaraen4 (String phrase) {
        int i;

        for (i=0; i <= phrase.length(); i++);{
                phrase.replace('a','4');
        }

    }
}
