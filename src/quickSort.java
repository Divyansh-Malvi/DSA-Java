import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 90, 45, 3, 0, 99, 1};
        System.out.println("Before sorting of an array = " + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting of an array = " + Arrays.toString(arr));

    }

    public static void sort(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        if (low >= high) {
            return;
        }
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        // now sorting 2 halves
        sort(arr, low, end);
        sort(arr, start, high);


    }
}
