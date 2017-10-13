import java.util.StringTokenizer;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ",color : " + getShapeColor() + ", width = " + getWidth() + ", height = " + getHeight();
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(toString());
        System.out.println(calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape rectangle = (Shape) o;
        return this.getShapeColor().compareTo(rectangle.getShapeColor());
    }

    @Override
    public int compare(Object o1, Object o2) {
        Rectangle rectangle1 = (Rectangle) o1;
        Rectangle rectangle2 = (Rectangle) o2;
        return rectangle1.getShapeColor().compareTo(rectangle2.getShapeColor());
    }

    public static Rectangle parseRectangle(String string) {
        Rectangle rectangle = null;
        String color = "";
        double h = 0;
        double w = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(string, "\t\n\r,:;");
        while (stringTokenizer.hasMoreElements()) {
            color = stringTokenizer.nextToken();
            h = Double.parseDouble(stringTokenizer.nextToken());
            w = Double.parseDouble(stringTokenizer.nextToken());
            rectangle = new Rectangle(color, h, w);
        }
        System.out.println(rectangle.toString());
        return rectangle;
    }
}
