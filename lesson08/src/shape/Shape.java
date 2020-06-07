package shape;

/*
5 Math!
Let's calulate the area of basic shapes. Write the following classes:

Circle, Rectangle, Triangle
All should receive the needed data, e.g. the radius of the circle, via a constructor
All should have a method getArea which calulates the area of the shape
 */
public class Shape {
    String shapeName;
    double sideA;
    double sideB;
    double radius;
    private double square = 0;

    public Shape(String shapeName, double sideA, double sideB) {
        this.shapeName = shapeName;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Shape(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    void getArea() {
        if(this.shapeName == "Rectangle") square = sideA * sideB;
        else if(this.shapeName == "Triangle") square = sideA * sideB;
        else if (this.shapeName == "Circle") square = Math.pow(radius, 2) * 3.14;
        System.out.println(square);
    }
}
