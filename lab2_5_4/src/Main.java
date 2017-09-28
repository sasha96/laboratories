public class Main {
    public static void main(String[] args) {
        MyInitClass myInitClass = new MyInitClass();
        myInitClass.printArray();
        /*
        I will see normal execution of the printin method,
        as the method not statik can take static fields
         */
    }
}
