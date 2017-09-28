public class MyInitClass {

    public static int arr[] = new int[10];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public int[] printArray() {
        for (int o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
        return arr;
    }

}
