public class GravityCalculator {

    public static void main(String[] args) {
        GravityCalculator.calcDist(10);
    }

    private static double gravity = -9.81;
    private static double initialVelocity = 0.0;
    private static final double POSITION = 0.0;
    private static double x;

    public static double calcDist(double time) {

        x = (0.5 * (gravity * (time * time)) + (initialVelocity * time) + (POSITION));
        System.out.println(x);
        return x;
    }
}

