package testenum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write day of week , and i write next day ");
        String string = scanner.nextLine();
        nextDay(string);

    }
    public  static void nextDay(String myDayOfWeek) {

        if (myDayOfWeek.equals("SUNDAY")) {
            System.out.println("Next day of week " + "MONDAY");

        } else if (myDayOfWeek.equals(MyDayOfWeek.MONDAY)) {
            System.out.println("Next day of week " + "TUESDAY");

        } else if (myDayOfWeek.equals(MyDayOfWeek.TUESDAY)) {
            System.out.println("Next day of week " + "WEDNESDAY");

        } else if (myDayOfWeek.equals(MyDayOfWeek.WEDNESDAY)) {
            System.out.println("Next day of week " + "THURSDAY");

        } else if (myDayOfWeek.equals(MyDayOfWeek.THURSDAY)) {
            System.out.println("Next day of week " + "FRIDAY");

        } else if (myDayOfWeek.equals(MyDayOfWeek.FRIDAY)) {
            System.out.println("Next day of week " + "SATURDAY");

        } else if (myDayOfWeek.equals(MyDayOfWeek.SATURDAY)) {
            System.out.println("Next day of week" + "SUNDAY");

        } else {
            System.out.println("This not day of week");
        }
    }

}
