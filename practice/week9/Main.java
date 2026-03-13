package practice.week9;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3.2, 4.5, 1.4);
        System.out.println(t1);

        double area = t1.getArea();
        System.out.printf("The area is %.2f ", area);
        System.out.println();

        double perimeter = t1.getPerimeter();
        System.out.println("The perimeter is " + perimeter);
    }
}
