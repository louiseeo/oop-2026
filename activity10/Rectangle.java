public class Rectangle extends GeometricObject {
    // Private fields
    private double width;
    private double height;

    // Constructor with width and height
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // Constructor with width, height, color, and filled
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Computes the area of rectangle
    public double getArea() {
        return height * width;
    }

    // Computes the perimeter of rectangle
    public double getPerimeter() {
        return 2 * (height + width);
    }

    
    @Override
    // Returns string description of the rectangle
    public String toString() {
        return "Rectangle with height of " + height + ", width of " + width + ", color: " + super.getColor();
    }

    @Override
    // Compares this rectangle with another object based on width and height
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) o;

        return Double.compare(this.width, other.width) == 0 &&
                Double.compare(this.height, other.height) == 0;
    }
}
