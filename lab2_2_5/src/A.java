public class A {
    private int b;
//overridden  the method  calcSquare for different areas
    public void calcSquare(final int a) {
        int variable = a * a;
        System.out.println(variable);
        return;
    }

    public void calcSquare(final int a, final int b) {
        int variable = a * b;
        System.out.println(variable);
        return;
    }

    public void calcSquare(final double a) {
        double variable = Math.PI * (a * a);
        System.out.println(variable);
        return;
    }
}