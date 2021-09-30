package pl.test.Konstruktory;

public class Dog extends Animals {
    private String name;
    private String breed;

    //konstruktor tylko dla klasy Dog
    Dog(String name, String breed){
        super(null, null);
        this.name = name;
        this.breed = breed;
    }
    //konstruktor Dog + super Animal
    Dog(String kingdom, String order, String breed){
        super(kingdom, order);
        this.breed = breed;
    }

    Dog(String phylum){
        super(phylum);;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
