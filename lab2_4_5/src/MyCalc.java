public class MyCalc {
    public static void main(String[] args) {
        MyCalc.calcPi(58888);
    }

    public static void calcPi(int variable) {
        double counter = 3;
        double del = 4;
        double result = 4;
        for (int i = 0; i < variable - 1; i++) {
            if (i % 2 == 0) {
                result -= del / counter;
            } else {
                result += del / counter;
            }
            counter += 2;

        }
        System.out.println(result);
    }
}
