package shape;

import music.Album;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Shape("Rectangle",3, 5);
        rectangle.getArea();
        Shape triangle = new Shape("Triangle",2, 5);
        triangle.getArea();
        Shape circle = new Shape("Circle", 2);
        circle.getArea();
    }
}
