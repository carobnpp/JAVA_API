package com.bnpparibas.epita.java.api.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainChanson {

    public static void main(String[] args) {
        Path monPath = Paths.get("src/com/bnpparibas/epita/java/api/files/paroles.txt");

        boolean exists = Files.exists(monPath);

        if (!exists){
            System.out.println("mon fichier n'existe pas");
            throw new RuntimeException("le fichier n'existe pas !");
        }

        Map<String, Integer> occurrences = new HashMap<>();

        try {
            List<String> lignes = Files.readAllLines(monPath);
            for (String ligne : lignes) {
                ligne = ligne.replaceAll("'", " ");
                ligne = ligne.replaceAll("\"", " ");

                String [] mots = ligne.split(" ");
                for (String mot : mots){
                    int nbrOccurrence = occurrences.getOrDefault(mot, 0);
                    occurrences.put(mot, ++nbrOccurrence);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        System.out.println(occurrences);
        Path monResultat = Paths.get("src/com/bnpparibas/epita/java/api/files/occurrences.txt");


    }
}
