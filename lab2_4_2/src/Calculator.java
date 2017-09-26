public class Calculator {

    public static void main(String[] args) {
        int array1[] = {123, 245, 5, 23, -345, -444};
        int array2[] = {13, 225, 0, 12, -34, -4, 34, 23, 78, 9};
        findMin(array1);
        findMax(array1);
        findMin(array2);
        findMax(array2);
    }

    public static int findMin(int array[]) {
        int min = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minValue " + min);
        return min;
    }

    public static int findMax(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maxValue " + max);
        return max;
    }

}


