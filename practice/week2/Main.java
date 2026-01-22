package practice.week2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(250);
        double area = circle.getArea();
        System.out.println("The area of the circle with a radius of " + circle.radius + " is " + area);
    }
}
