import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
int i = Integer.parseInt(scanner.nextLine());
Shape shape [] = new Shape[i];

        for (int j = 0; j < shape.length; j++) {
            String s = scanner.nextLine();
            String color;
            int z;
            int x;
            int c;
            switch (s){
                case "Rectangle":
                    color=scanner.nextLine();
                    z=Integer.parseInt(scanner.nextLine());
                    x=Integer.parseInt(scanner.nextLine());
                    Rectangle rec = new Rectangle(color,z,x);
                    shape[j] = rec;
                    break;
                case "Triangle":
                    color=scanner.nextLine();
                    z=Integer.parseInt(scanner.nextLine());
                    x=Integer.parseInt(scanner.nextLine());
                    c=Integer.parseInt(scanner.nextLine());
                    Triangle tre = new Triangle(color,z,x,c);
                    shape[j] = tre;
                    break;
                case "Circle":
                    color=scanner.nextLine();
                    z=Integer.parseInt(scanner.nextLine());
                    Circle cir = new Circle(color,z);
                    shape[j] = cir;
            }

        }
        for (Shape o: shape) {
            o.draw();
        }
    }
}