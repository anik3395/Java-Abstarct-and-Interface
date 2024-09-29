package Problem5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(150,200);
        rectangle.printSize();

        rectangle.resizeWidth(150);
        rectangle.resizeHeight(200);
        rectangle.printSize();
    }
}
