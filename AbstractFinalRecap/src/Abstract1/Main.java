package Abstract1;

public class Main {
    public static void main(String[] args) {
        Shape shape;
        shape=new Rectangle(10,20);
        shape.area();

        shape=new Triangle(10,20);
        shape.area();

        shape=new Circle(30);
        shape.area();

    }
}
