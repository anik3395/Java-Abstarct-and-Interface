package Abstract1;

public class Triangle extends Shape {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    void area() {
        double result;
        result = 0.5 * dim1 * dim2;
        System.out.println( " The are of Triangle is : " + result);

    }
}
