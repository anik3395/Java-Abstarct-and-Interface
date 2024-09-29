package Abstract1;

public class Circle extends Shape {
    public Circle(double r) {
        super(r, r);
    }
    void area() {
        double result;
        result = 3.1416 * dim1 * dim2;
        System.out.println( " The are of Circle is : " + result);

    }
}
