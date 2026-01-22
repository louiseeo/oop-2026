package practice.week2;

public class Circle{
    double radius;
    static final double PI = 3.1416;
    

    // add a default constructor
    public Circle(){}

    // one that accepts property
    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }
}