package com.bnpparibas.epita.java.api.enumeration;

public enum JourdelaSemaine {
    DIMANCHE(true, "😊"),
    LUNDI (false, "😒"),
    MARDI(false, "😒"),
    MERCREDI(false,"😒"),
    JEUDI(false,"😒"),
    VENDREDI(false,"😊"),
    SAMEDI(true,"😁");



    private final boolean we;
    private final String smiley;

    public boolean isWe() {
        return we;
    }

    public String getSmiley() {
        return smiley;
    }

    JourdelaSemaine(boolean we, String smiley) {   //* par défaut en private
        this.we = we;
        this.smiley = smiley;
    }

}

