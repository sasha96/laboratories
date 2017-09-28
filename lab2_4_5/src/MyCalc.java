public class MyCalc {
    public static void main(String[] args) {
        MyCalc.calcPi(52468);
    }

    public static void calcPi(int variable) {
        double counter = 0;
        double del = 4;
        double result = 4;
        for (double i = 3; i <= variable; i++) {
            if (counter % 2 == 0 && i % 2 != 0) {
                result -= del / i;
                counter++;
            } else if (counter % 2 != 0 && i % 2 != 0) {
                result += del / i;
                counter++;
            }

        }

        System.out.println(result);

    }
}
