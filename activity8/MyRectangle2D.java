package activity8;

public class MyRectangle2D {
    // Private fields
    private double x;
    private double y;
    private double width;
    private double height;

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // No-arg constructor that sets values for fields
    public MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Method that returns area of rectangle
    public double getArea() {
        return width * height;
    }

    // Method that returns perimeter of rectangle
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    // Method checking if point is inside the rectangle
    public boolean contains(double x, double y) {
        // calculate the boundaries for the rectangle
        double right = this.x + (this.width / 2);
        double left = this.x - (this.width / 2);
        double top = this.y + (this.height / 2);
        double bottom = this.y - (this.height / 2);
        return (x >= left && x <= right) && (y >= bottom && y <= top);
    }

    // Method that checks if a rectangle is inside a rectangle
    public boolean contains(MyRectangle2D r) {
        // r(right & top) <= this(right & top)
        // r(left & bottom()) >= this(left & bottom)
        return ((r.getX() + (r.getWidth() / 2)) <= (this.getX() + (this.getWidth() / 2)) && // right
                (r.getX() - (r.getWidth() / 2)) >= (this.getX() - (this.getWidth() / 2)) && // left
                (r.getY() + (r.getHeight() / 2)) <= (this.getY() + (this.getHeight() / 2)) && // top
                (r.getY() - (r.getHeight() / 2)) >= (this.getY() - (this.getHeight() / 2))); // bottom

    }

    // Method that checks if a rectangle is overlapping another rectangle
    public boolean overlaps(MyRectangle2D r) {
        // calculate values for (right, left, top, bottom for r and given rectangle)
        double thisRight = this.getX() + (this.getWidth() / 2);
        double thisLeft = this.getX() - (this.getWidth() / 2);
        double thisTop = this.getY() + (this.getHeight() / 2);
        double thisBottom = this.getY() - (this.getHeight() / 2);

        double rRight = r.getX() + (r.getWidth() / 2);
        double rLeft = r.getX() - (r.getWidth() / 2);
        double rTop = r.getY() + (r.getHeight() / 2);
        double rBottom = r.getY() - (r.getHeight() / 2);

        // returns true if both rectangle overlap
        return (rRight >= thisLeft && rLeft <= thisRight &&
                rTop >= thisBottom && rBottom <= thisTop);

    }

}