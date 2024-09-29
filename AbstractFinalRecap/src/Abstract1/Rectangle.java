package Abstract1;

public class Rectangle extends Shape {
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    void area() {
        double result;
        result = dim1 * dim2;
        System.out.println( " The are of Rectangle is : " + result);

    }
}
