package pl.test.Konstruktory;

public class Animals {
    //pola klasy
    private String kingdom;
    private String order;
//    private String phylum;


    //konstruktor
    Animals(String kingdom, String order) { //konstruktor musi mieć taką samą nazwę jak klasa
        this.kingdom = kingdom;
        this.order = order;
    }

//    Animals(String phylum) {
//        this.phylum = phylum;
//    }


}
