package pl.test.Konstruktory;

public class Animals {
    //pola klasy
    private String kingdom;
    private String order;
    private String phylum;


    //konstruktor
    Animals(String kingdom, String order) { //konstruktor musi mieć taką samą nazwę jak klasa
        this.kingdom = kingdom;
        this.order = order;
    }

    Animals(String phylum) {
        this.phylum = phylum;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }
}
