

public abstract class Shape implements Drawable {
    public abstract double calcArea();

    private String shapeColor;

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
