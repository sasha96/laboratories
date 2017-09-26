public class MyMath {
    public static void main(String[] args) {
        int array[] = {123, 245, 5, 23, -345,-444};
        findMin(array);
        findMax(array);
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

