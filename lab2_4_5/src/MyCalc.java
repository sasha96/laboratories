public class MyCalc {
    public static void main(String[] args) {
        MyCalc.calcPi(12345);
    }

    public static void calcPi(int variable) {
        double result = 4;
        double del = 4;
        for (double i = 3; i <= variable; i++) {
            if (i % 2 == 0) {
                result += del / i;
            }
            if (i % 2 != 0) {
                result -= del / i;
            }
        }
        System.out.println(result);
    }
}
