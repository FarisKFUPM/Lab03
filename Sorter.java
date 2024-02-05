import java.util.Arrays;

public class Sorter {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
       public static void sort(int[] array) {
        insertionSort(array);
    }

       public static void sort(int[] array) {
        selectionSort(array);
    }
}


