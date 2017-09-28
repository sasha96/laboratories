public class MyInitClass {

    public static void main(String[] args) {
        MyInitClass myInitClass = new MyInitClass();
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    MyInitClass() {
        this(10);
        System.out.println("constructor 1");
    }

    MyInitClass(int i) {
        System.out.println("constructor 2");
    }
}
