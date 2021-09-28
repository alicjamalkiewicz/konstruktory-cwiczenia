package pl.test.Konstruktory;

public class Dog extends Animals {
    private String name;
    private String breed;

    //konstruktor tylko dla klasy Dog
    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    //konstruktor Dog + super Animal
    Dog(String kingdom, String order, String breed){
        super(kingdom, order);
        this.breed = breed;
    }

}
