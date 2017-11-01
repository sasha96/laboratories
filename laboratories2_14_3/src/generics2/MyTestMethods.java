package generics2;

public class MyTestMethods<T> {

    public static <T> String calcNum(Integer[] array, Integer maxElem) {
        int count = 0;
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElem) {
                ++count;
                suma += array[i];
            }
        }
        return count + "   " + suma;
    }
}