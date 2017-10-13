
public class Main {
    public static void main(String[] args) {
        Rectangle.parseRectangle("red:10,20");
        Triangle.parseTriangle("black:21,22,10");
        Circle.parseCircle("green:2");
        Shape.parseShape("Rectangle:red:20,30");
    }
}