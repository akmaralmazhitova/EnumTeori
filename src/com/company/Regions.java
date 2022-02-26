package com.company;

public enum Regions {
    CHUY("Many peoples"),
    ISSIK_KOL("Touristik region"),
    TALAS("Buurchak"),
    NARIN("Animals"),
    JALAL_ABAD("Investigation"),
    OSH("Sulayman too"),
    BATKEN("Aygul gulu");

    public  String spesific;


    Regions(String spesific) {
        this.spesific = spesific;

    }

    @Override
    public String toString() {
        return  super.toString() + " -> " + spesific +".";
    }
}

