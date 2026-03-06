package activity8;

public class Main {
    public static void main(String[] args) {

        // Create a rectangle objects
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9); // main rectangle
        MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2); // for contains checking
        MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4); // for overlapping checking

        // Find the area
        double area = r1.getArea();
        System.out.printf("Rectangle r1 area: %.2f m²\n", area );

        // Find the perimeter
        double perimeter = r1.getPerimeter();
        System.out.printf("Rectangle r1 perimeter: %.2f m\n", perimeter);

        // Check if specified point is inside the rectangle
        if (r1.contains(3, 3))
            System.out.println("The point (3,3) is inside the rectangle.");
        else
            System.out.println("The point (3,3) is not inside the rectangle.");

        // Check if r2 is inside r1
        if (r1.contains(r2))
            System.out.println("The specified rectangle r2 (4, 5, 10.5, 3.2) is inside rectangle r1.");
        else 
            System.out.println("The specified rectangle r2 (4, 5, 10.5, 3.2) is not inside rectangle r1.");

        // Check if r3 overlaps r1
        if (r1.overlaps(r3))
            System.out.println("The specified rectangle r3 (3, 5, 2.3, 5.4) overlaps rectangle r1.");
        else
            System.out.println("The specified rectangle r3 (3, 5, 2.3, 5.4) does not overlap rectangle r1.");

    }

}
