package Problem1W3Resoures;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.1416 * radius * radius;
    }
}
