public abstract class Shape extends ShapeColorComparator implements Drawable, Comparable {
    public abstract double calcArea();

    public String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "This is : " + getClass().getSimpleName() + " , color is : " + getShapeColor();
    }
}
