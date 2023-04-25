package com.bnpparibas.epita.java.api.string;


public class MainString {


    public static void main(String[] args) {

        String result = ChaineDeCaractere.TransformerMajuscule("en minuscule");
        System.out.println("en majuscule: " + result);

        int nombrecar = ChaineDeCaractere.calculNombreCaracteresa("j'ai beaucoup de aaa");
        System.out.println("nombre de a: " + nombrecar);

        System.out.println(ChaineDeCaractere.transformercaraen4("j'ai beaucoup de aaa"));

        System.out.println(ChaineDeCaractere.supprimercar5et10("dddddssssssdddddd"));

    }
}
