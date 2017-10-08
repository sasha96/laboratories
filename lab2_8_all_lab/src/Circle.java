
class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius){
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
        return "This is " + getClass().getSimpleName() + " , color " + getShapeColor() + " , radius = " + getRadius();
    }
    @Override
    public void draw() {
        System.out.println(toString());
        System.out.println(calcArea());
    }
}

