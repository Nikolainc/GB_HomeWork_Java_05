package Class;

public class HeapSort {

    public static void HeapSort(int array[]) {

        for (int i = array.length / 2 - 1; i >= 0; i--) {

            heap(array, i);

        }

        for (int i = array.length - 1; i > 0; i--) {

            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, 0);
        }

    }

    private static void heap(int array[], int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < array.length && array[l] > array[largest]){

            largest = l;

        }

        if (r < array.length && array[r] > array[largest]) {

            largest = r;

        }

        if (largest != i) {

            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heap(array, largest);

        }

    }

    public void print(int[] array) {

        for (int i = 0; i < array.length; ++i) {

            System.out.print(array[i] + " ");

        }

        System.out.println();

    }
    
}