package testexcp1;

public class MyTest {
    public void test() throws MyException {

        try {
            throw new MyException("Exception");
        } catch (MyException ex) {
            System.out.println("Exception from class MyTest");
        }
    }
}
