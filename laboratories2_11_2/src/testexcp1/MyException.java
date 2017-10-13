package testexcp1;

public class MyException extends Exception {
    MyException(String string) {
        String str = string;
    }

    public MyException returnString(MyException my) {
        return my;
    }
}
