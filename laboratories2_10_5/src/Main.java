import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        Shape shape[] = new Shape[i];
        for (int j = 0; j < shape.length; j++) {
            shape[j] = Shape.parseShape(scanner.nextLine());
        }
    }
}