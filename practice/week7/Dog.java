package practice.week7;

public class Dog {
    private String color;

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark(){
        System.out.println("bark bark");
    }

    @Override
    public void displayInfo(){
        super.displayInfo;
        System.out.println();
    }
}
