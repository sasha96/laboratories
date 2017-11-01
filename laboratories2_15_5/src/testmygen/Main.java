package testmygen;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 6);
        System.out.println(myNumGenerator.generate());
        System.out.println(myNumGenerator.generatorDistinct());

    }
}
