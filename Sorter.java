import java.util.Arrays;

public class Sorter {

        public static void selectionSort(int[] array) {
            int n = array.length;

            // Traverse the array
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in the unsorted part of the array
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] array = {64, 25, 12, 22, 11};
            System.out.println("Original array: " + Arrays.toString(array));

            // Call the selectionSort method
            selectionSort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }


