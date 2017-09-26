public class MyMath {
    public static void main(String[] args) {
        areaOfCircle(5);
    }

    public final static double PI = 3.14;

    public static double areaOfCircle(int radius) {
        double areaOfCircle =  PI * (radius * radius);
        System.out.println(areaOfCircle);
        return areaOfCircle;
    }
}
