package pl.test.Konstruktory;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Animalia", "Carnivora", "Golden Retriever");
        System.out.println(dog.getKingdom());

        Dog dog2 = new Dog("Gustaw", "Corgi");
        System.out.println(dog2.getBreed());

        Dog dog3 = new Dog("Chordate");
        System.out.println(dog3.getPhylum());
    }
}
