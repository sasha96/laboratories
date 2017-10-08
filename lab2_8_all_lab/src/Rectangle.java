public class Rectangle extends Shape  {
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
        Rectangle rectangle = (Rectangle) o;
        if (this.calcArea() > rectangle.calcArea()) return 1;
        if (this.calcArea() < rectangle.calcArea()) return -1;
        return 0;
    }
}
