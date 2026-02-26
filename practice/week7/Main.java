package practice.week7;

public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Canidae", "Domestic Dog", "Bronny", "Brown");
        dog1.bark();

        Dog dog2 = new Dog("Canidae", "Domestic Dog", "Max", "White");
        dog2.bark();

        Cat cat1 = new Cat("Felidae", "Domestic Cat", "Cookie", "Black");
        cat1.meow();

        Cat cat2 = new Cat("Felidae", " Domestic Cat", "Muning", "Black and White");
        cat2.meow();
    }

}