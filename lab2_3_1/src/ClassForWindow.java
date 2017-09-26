public class ClassForWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public void printFields() {
        System.out.println(("color " + getColor() + " height " + getHeight() + " getNumberOfClass "
                + getNumberOfGlass() + " width " + getWidth() + " getOpen " + getOpen()));
        //  System.out.println(width+height+NumberOfGlass + color + isOpen);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

}
