import java.util.StringTokenizer;

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

    public static Shape parseShape(String str) {
        String name = "";
        String color = "";
        double r = 0;
        double w = 0;
        double e = 0;
        Shape shape = null;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\t\n\r,:;");
        while (stringTokenizer.hasMoreElements()) {
            name = stringTokenizer.nextToken();
            System.out.println(name);
        }
        switch (name) {
            case "Rectangle":
                while (stringTokenizer.hasMoreElements()) {
                    color = stringTokenizer.nextToken();
                    r = Double.parseDouble(stringTokenizer.nextToken());
                    w = Double.parseDouble(stringTokenizer.nextToken());
                    shape = new Rectangle(color, r, w);
                }
            case "Triangle":
                while (stringTokenizer.hasMoreElements()) {
                    color = stringTokenizer.nextToken();
                    r = Double.parseDouble(stringTokenizer.nextToken());
                    w = Double.parseDouble(stringTokenizer.nextToken());
                    e = Double.parseDouble(stringTokenizer.nextToken());
                    shape = new Triangle(color, r, w, e);
                }
            case "Circle":
                while (stringTokenizer.hasMoreElements()) {
                    color = stringTokenizer.nextToken();
                    r = Double.parseDouble(stringTokenizer.nextToken());
                    shape = new Circle(color, r);
                }
        }

        return shape;
    }
}
