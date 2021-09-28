package pl.test.Konstruktory;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Animalia", "Carnivora", "Golden Retriver");
        System.out.println(dog);

        Dog dog2 = new Dog("Gustaw", "Corgy");
        System.out.println(dog2);
    }
}
