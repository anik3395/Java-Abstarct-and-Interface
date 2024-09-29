package Problem1W3Resoures;

public class Main {


    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(10,12);
      System.out.println("Area of the Rectangle: " + rectangle.getArea());

      Circle circle = new Circle(3);
      System.out.println("Area of the Circle: " + circle.getArea());

      Triangle triangle = new Triangle(4,6);
      System.out.println("The Area of triangle is : " + triangle.getArea());

    }
}
