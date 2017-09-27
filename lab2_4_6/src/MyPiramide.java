public class MyPiramide {
    public static void main(String[] args) {
        System.out.println(MyPiramide.printPiramide(5));
    }

    public static int printPiramide(int w) {
        int row = 1;
        for (int i = w; i > 0; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            for (int j = row - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

            row++;
        }
        return w;
    }
}

