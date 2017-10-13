package testexcp1;

public class Main {

    public static void main(String[] args) throws Exception {
//        String a = "Throws Exception";
//        try {
//            throw new MyException(a);
//        } catch (MyException e) {
//            System.out.println(e.returnString(e));
//        } finally {
//            System.out.println("finally");
//        }
        MyTest myTest = null;
        try {
            myTest.test();
        } catch (NullPointerException ex) {
            System.out.println("myTest = null");
        }
    }
}
