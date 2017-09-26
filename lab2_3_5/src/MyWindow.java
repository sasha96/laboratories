import java.util.Arrays;

public class MyWindow {

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow(5, 3);
        MyWindow array[] = new MyWindow[5];
        for (int i = 0; i < array.length; i++) {
            if (i <= 2) {
                array[i] = new MyWindow(i + 10, i + 20);
            } else {
                array[i] = new MyWindow(i + 20, i + 30, --i + " string " + ++i);
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i].printFields(array);
        }

    }

    private int heigth;
    private int width;
    private String numberOfGlass;

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(String numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(int heigth, int width) {
        this.heigth = heigth;
        this.width = width;
    }

    public MyWindow(int heigth, int width, String numberOfGlass) {
        this.heigth = heigth;
        this.width = width;
        this.numberOfGlass = numberOfGlass;

    }

    public void printFields(MyWindow[] array) {
        System.out.println("heigth " + getHeigth() + " width " + getWidth() + " numberOfGlass " + getNumberOfGlass());
    }

}
