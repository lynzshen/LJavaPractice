public class SortingProject {

    public static void main(String[] args) {
        int size = 50000;
        int arr[] = new int[size];
        int originalArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            //generating the random element in the range of 0 and 1000
            originalArray[i] = (int) (Math.random() * 1001);
        }

        for (int i = 0; i < size; i++) {
            arr[i] = originalArray[i];
        }

        long startTime = System.currentTimeMillis();
        selectionSort(arr);
        long endTime = System.currentTimeMillis();

        long requiredTime = endTime - startTime;

        System.out.println("Time required for selection sort: " + requiredTime + " ms");

        for (int i = 0; i < size; i++) {
            arr[i] = originalArray[i];
        }


        startTime = System.currentTimeMillis();
        quicksort(arr, 0, arr.length - 1);
        endTime = System.currentTimeMillis();

        requiredTime = endTime - startTime;

        System.out.println("Time required for Quicksort: " + requiredTime + " ms");
    }

    static int partition(int arr[], int start, int end) {
        int i = start - 1;

        int pivot = end;
        for (int j = start; j < end; j++) {
            if (arr[j] < arr[pivot]) {
                i++;
                swap(arr, j, i);
            }
        }
        i++;
        swap(arr, i, pivot);
        return i;
    }


    public static void quicksort(int arr[], int start, int end) {

        if (start < end) {
            int partitionedIndex = partition(arr, start, end);
            quicksort(arr, start, partitionedIndex - 1);
            quicksort(arr, partitionedIndex + 1, end);
        }
    }

    static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; ++i) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }


}