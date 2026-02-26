package practice.week7;

public class Cat extends Animal {
    private String color;

    public Cat(){}

    public Cat(String family, String specie, String name, String color) {
        super(family, specie, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow(){
        System.out.println(getName() + " says meow meow!");
    }
}
