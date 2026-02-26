package practice.week7;

public class Dog extends Animal {
    private String color;

    public Dog(){

    }
    public Dog(String family, String specie, String name, String color) {
        super(family, specie, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark(){
        System.out.println(getName() + " goes woof woof!");
    }

}
