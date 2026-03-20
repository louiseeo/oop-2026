public class Circle extends GeometricObject {
    // Private field
    private double radius;

    // Constructor with radius only
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Computes the area of circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Computes the perimeter of a circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    // Returns string description of circle
    public String toString() {
        return "Circle with radius " + radius + ", color: " + super.getColor();
    }

    @Override
    // Compares this circle with another object based on their radius
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) o;

        return Double.compare(this.radius, other.radius) == 0;
    }
}
