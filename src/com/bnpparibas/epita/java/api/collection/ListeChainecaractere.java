package com.bnpparibas.epita.java.api.collection;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ListeChainecaractere {

    public static void afficherlaliste(Collection<String> collection)
    {
        for (String element : collection ) {
            System.out.println(element);
        }
        return;
    }

    //test pour Git
    public static void afficherlaliste(Set<Integer> set)
    {
        for (Integer element : set ) {
            System.out.println(element);
        }
        return;
    }




}
