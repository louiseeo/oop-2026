package practice.week7;

public class Cat {
    private String color;

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow(){
        System.out.println("meow meow");
    }
}
