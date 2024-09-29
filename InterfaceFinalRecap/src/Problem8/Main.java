package Problem8;

public class Main {
    public static void main(String[] args) {
        // Create instances of Drawable objects, which are Circle, Rectangle, and Triangle
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        // Call the "draw" method to display each shape
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
