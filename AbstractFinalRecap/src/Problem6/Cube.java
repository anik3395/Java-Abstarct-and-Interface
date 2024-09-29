package Problem6;

public class Cube extends Shape3D{
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
