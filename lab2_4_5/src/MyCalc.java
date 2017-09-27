public class MyCalc {
    public static void main(String[] args) {
        MyCalc.calcPi(12523);
    }

    public static void calcPi(int variable) {
        double counter = 0;
        double counter2 = 0;
        double del = 4;
        for (double i = 3; i < variable; i += 2) {
            if (counter % 2 == 0) {
                counter2 += del / i;
            } else if (counter % 2 != 0) {
                counter2 -= del / i;
            }
            counter++;
        }
        del -=counter2;
        System.out.println(del);
    }
}
