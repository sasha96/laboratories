import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Shape.parseShape("Circle:red,2");
//        Shape.parseShape("Rectangle:black,2,3");
//        Shape.parseShape("Triangle:blue,2,3,4");
//        Shape.parseShape("Triangleblue234");

        Scanner scanner = new Scanner(System.in);
        Shape.parseShape(scanner.nextLine());
    }
}