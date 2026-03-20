import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create arraylist
        List<GeometricObject> objects = new ArrayList<>();

        // Create 2 objects for each shape
        Circle c1 = new Circle(5.6);
        Circle c2 = new Circle(7.6);
        Rectangle r1 = new Rectangle(3.4, 5.6);
        Rectangle r2 = new Rectangle(3.4, 5.6);

        // Add creates objects to arraylist
        objects.add(c1);
        objects.add(c2);
        objects.add(r1);
        objects.add(r2);

        // For loop for printing of area and perimeter for all given objects
        for (GeometricObject o : objects) {
            System.out.println("Object: " + o.getClass().getSimpleName());
            System.out.printf("Area: %.2f \n", o.getArea());
            System.out.printf("Perimeter: %.2f \n", o.getPerimeter());
            System.out.println();
        }

        // Compare the two objects given per shape
        System.out.println("Circle comparison: " + c1.equals(c2));
        System.out.println("Rectangle comparison: " + r1.equals(r2));
    }
}