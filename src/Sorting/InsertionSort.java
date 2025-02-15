import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int temp;
        int i;
        int j;
        for (i = 1; i < arr.length ; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 17, 9, 1, 0};
        System.out.println("Before sorting array = " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting array = " + Arrays.toString(arr));
    }
}
