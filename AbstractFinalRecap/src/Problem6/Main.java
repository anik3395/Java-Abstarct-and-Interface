package Problem6;

public class Main {
    public static void main(String[] args) {
        Shape3D shape3D;
        shape3D = new Sphere(7.0);
        System.out.println(shape3D.calculateVolume());
        System.out.println(shape3D.calculateSurfaceArea());

        shape3D=new Cube(6.0);
        System.out.println(shape3D.calculateVolume());
        System.out.println(shape3D.calculateSurfaceArea());
    }
}
