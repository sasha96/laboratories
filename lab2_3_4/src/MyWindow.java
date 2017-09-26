public class MyWindow {

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow(5, 3);
    }

    private int heigth;
    private int width;
    private String numberOfGlass;

    public MyWindow(int heigth, int width) {
        this(10, 20, "hello");
    }

    public MyWindow(int heigth, int width, String numberOfGlass) {
        this.heigth = heigth;
        this.width = width;
        this.numberOfGlass = numberOfGlass;

    }

}
