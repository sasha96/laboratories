package src;

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

    public static Shape parseShape(String str,String color,int i, int t, int y){
        Shape shape = null;

        switch (str) {
            case "Tringle":shape = new Triangle(color,i,t,y);
        }
        return shape;
    }
    public static Shape parseShape(String str,String color,int i, int t){
        Shape shape = null;

        switch (str) {
            case "Rectangle":shape = new Rectangle(color,i,t);
        }
        return shape;
    } public static Shape parseShape(String str,String color,int i){
        Shape shape = null;
        switch (str) {
            case "Circle":shape = new Circle(color,i);
        }
        return shape;
    }
}
