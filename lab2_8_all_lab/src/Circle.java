import sun.security.provider.SHA;

class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +  ",   color : " + getShapeColor() + " , radius = " + getRadius();
    }

    @Override
    public void draw() {
        System.out.println(toString());
        System.out.println(calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape circle = (Shape) o;
        return this.getShapeColor().compareTo(circle.getShapeColor());
    }

    @Override
    public int compare(Object o1, Object o2) {
        Circle circle1 = (Circle) o1;
        Circle circle2 = (Circle) o2;
        return circle1.getShapeColor().compareTo(circle2.getShapeColor());
    }
}

